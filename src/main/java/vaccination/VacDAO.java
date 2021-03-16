package vaccination;

import org.w3c.dom.ls.LSOutput;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class VacDAO {

    private DataSource dataSource;

    public VacDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public boolean registerCitizen(Citizen citizen) {

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into citizens(citizen_name, zip, age, email, taj, number_of_vaccination) values(?, ?, ?, ?, ?, ?)")) {
            stmt.setString(1, citizen.getName());
            stmt.setString(2, citizen.getZip());
            stmt.setInt(3, citizen.getAge());
            stmt.setString(4, citizen.getEmail());
            stmt.setString(5, citizen.getTaj());
            stmt.setInt(6, 0);
            stmt.executeUpdate();

        } catch (SQLException SQLe) {
            System.out.println("Sikertelen kapcsolat, kérjük próbála meg később!");
            return false;
        }

        return true;
    }

    public List<Citizen> generateVacQueueByZip(String zip) {
        List<Citizen> citizens = new ArrayList<>();

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from citizens where zip = ? order by age DESC, citizen_name ASC")
             ) {
            stmt.setString(1, zip);
            try (ResultSet rs = stmt.executeQuery()){
                int counter = 0;
                while (rs.next() && counter < 16) {
                    Citizen citizen = new Citizen(rs.getString("citizen_name"), rs.getString("zip"), rs.getInt("age"), rs.getString("email"), rs.getString("taj"));
                    citizen.setId(rs.getInt("id"));
                    citizen.setNumber_of_vaccination(rs.getInt("number_of_vaccination"));
                    if(citizen.getNumber_of_vaccination() > 0)
                    {
                        citizen.setLast_vaccination(rs.getDate("last_vaccination").toLocalDate().atStartOfDay());
                    }
                    if (citizen.getNumber_of_vaccination() < 1 || (citizen.getNumber_of_vaccination() ==1 && citizen.getLast_vaccination().isBefore(LocalDateTime.now().minusDays(15)))) {
                        citizens.add(citizen);
                        counter++;
                    }
                }
            }
            catch (SQLException SQLe)
            {System.out.println("A keresésnek nem lett eredménye!");
                return null;}
            return citizens;
        } catch (SQLException SQLe) {
            System.out.println("Az adatbázis kapcsolat nem jött létre, kérjük próbálja meg később!");
            return null;
        }
    }

    public Citizen getCitizenByTaj(String taj) {

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from citizens where taj = ?")) {
            stmt.setString(1, taj);
            try (ResultSet rs = stmt.executeQuery()){
                rs.next();
                Citizen citizen = new Citizen(rs.getString("citizen_name"), rs.getString("zip"), rs.getInt("age"), rs.getString("email"), rs.getString("taj"));
                citizen.setId(rs.getInt("id"));
                citizen.setNumber_of_vaccination(rs.getInt("number_of_vaccination"));
                if(citizen.getNumber_of_vaccination() > 0) {
                    citizen.setLast_vaccination(rs.getDate("last_vaccination").toLocalDate().atStartOfDay());
                }
                return citizen;
            }catch (SQLException SQLe){
                System.out.println("Az adatbáziskapocsolat meghiúsult!");
                return null;
            }
        } catch (SQLException SQLe) {
            System.out.println("Az adatbáziskapocsolat meghiúsult, próbálja meg később!");
            return null;
        }
    }

    public String getVaccinationTypeByCitizenId(int id) {

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select vaccination_type from vaccination where citizen_id = ? AND status = ?")) {
            stmt.setInt(1, id);
            stmt.setString(2, "Megvalósult");
            ResultSet rs = stmt.executeQuery();
            rs.next();
            return rs.getString(1);
        } catch (SQLException SQLe) {
            System.out.println("Az adatbáziskapocsolat meghiúsult, próbálja meg később!");
            return null;
        }
    }


    public String getVaccinationTypeByTaj(String taj) {
        Citizen citizen = this.getCitizenByTaj(taj);
        return this.getVaccinationTypeByCitizenId(citizen.getId());

    }

    public void updateLines(Citizen citizen, String vacType, int numOfVac, String status, String note) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt1 = conn.prepareStatement("update citizens set number_of_vaccination = ?, last_vaccination = ? where id = ?");
             PreparedStatement stmt2 = conn.prepareStatement("insert into vaccination (citizen_id, vaccination_date, status, note, vaccination_type) values(?,?,?,?,?)")) {
            conn.setAutoCommit(false);
            try {
                stmt2.setInt(1, citizen.getId());
                stmt2.setDate(2, Date.valueOf(LocalDate.now()));
                stmt2.setString(3, status);
                stmt2.setString(4, note);
                stmt2.setString(5, vacType);
                stmt2.executeUpdate();

                if (!"Meghiúsult".equals(status)) {
                    stmt1.setInt(1, numOfVac);
                    stmt1.setDate(2, Date.valueOf(LocalDate.now()));
                    stmt1.setInt(3, citizen.getId());
                    stmt1.executeUpdate();
                }
                conn.commit();
            } catch (SQLException SQLe) {
                System.out.println("Sikertelen művelet!");
                conn.rollback();
            }

        } catch (SQLException SQLe) {
            System.out.println("Az adatbáziskapcsolat meghiúsult, próbálja meg később!");
            return;
        }
    }

    public List<ZipReport> generateEmptyReports() {

        List<ZipReport> zipReports = new ArrayList<>();

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select distinct zip from cities");
             ResultSet rs = stmt.executeQuery())
        {
            while(rs.next()){
                zipReports.add(new ZipReport(rs.getString("zip")));
            }
        }
        catch (SQLException SQLe) {
            System.out.println("Az adabáziskapcsolat nem létesült, próbálja meg később!");
            return null;
        }
        return zipReports;
    }

    public void fillReport(List<ZipReport> zipReports) {

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select zip, number_of_vaccination from citizens");
             ResultSet rs = stmt.executeQuery())
        {
            while(rs.next()){
                String zip = rs.getString("zip");
                int index = IntStream.range(0, zipReports.size())
                        .filter(i -> zipReports.get(i).getZip().equals(zip))
                        .findFirst()
                        .orElse(-1);
                int vaccination = rs.getInt("number_of_vaccination");
                if( vaccination == 2){
                    zipReports.get(index).increaseSV();
                }
                else if( vaccination == 1)
                {
                    zipReports.get(index).increaseFV();
                }
                else{
                    zipReports.get(index).increaseNV();
                }
            }
        }
        catch (SQLException SQLe) {
            System.out.println("Az adabáziskapcsolat nem létesült, próbálja meg később!");
            return;
        }
    }
}
