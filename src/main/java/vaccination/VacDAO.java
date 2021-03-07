package vaccination;

import activitytracker.Activity;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;

public class VacDAO {

    private DataSource dataSource;

    public VacDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public boolean registerCitizen(Citizen citizen) {

        try(Connection conn = dataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement("insert into citizens(citizen_name, zip, age, email, taj, number_of_vaccination, last_vaccination) values(?, ?, ?, ?, ?, ?, ?)"))
        {
            stmt.setString(1, citizen.getName());
            stmt.setString(2, citizen.getZip());
            stmt.setInt(3, citizen.getAge());
            stmt.setString(4, citizen.getEmail());
            stmt.setString(5, citizen.getTaj());
            stmt.setInt(5, 0);
            stmt.setDate(3, Date.valueOf(LocalDate.now()));
            stmt.executeUpdate();

            /*try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    int id = rs.getInt(1);
                    citizen.setId(id);
                }
            } catch (SQLException se) {
                throw new IllegalStateException("Azonosító nem található!", se);
            }*/

        }
        catch (SQLException SQLe) {
            System.out.println("Sikertelen kapcsolat, kérjük próbála meg később!");
            return false;
        }

        return true;
    }
}
