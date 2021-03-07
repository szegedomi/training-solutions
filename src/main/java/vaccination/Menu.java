package vaccination;



import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public void register(VacDAO vd, Validator validator) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String zip;
        int age;
        String email;
        String email2;
        String taj;

        System.out.println("Kérjük, adja meg a következő adatait!");

        System.out.println("Neve:");
        name = scanner.nextLine();
        if(validator.isEmpty(name)){
            System.out.println("Érvénytelen név, sikertelen regisztráció!");
            return;
        }

        System.out.println("Irányítószáma:");
        zip = scanner.nextLine();
        if(validator.isEmpty(zip)){
            System.out.println("Érvénytelen irányítószám, sikertelen regisztráció!");
            return;
        }
        System.out.println(zip + ": ");

        System.out.println("Email címe:");
        email = scanner.nextLine();
        if(validator.isInvalidEmail(email)){
            System.out.println("Érvénytelen email cím, sikertelen regisztráció!");
            return;
        }

        System.out.println("Email cím mgerősítése:");
        email2 = scanner.nextLine();
        if(!email.equals(email2)){
            System.out.println("Email cím nem lett megerősítve, sikertelen regisztráció!");
            return;
        }

        System.out.println("Tajszáma:");
        taj = scanner.nextLine();
        if(validator.isInvalidTaj(taj)){
            System.out.println("Érvénytelen tajszám, sikertelen regisztráció!");
            return;
        }

        System.out.println("Életkora:");
        age = scanner.nextInt();
        if(validator.isInvalidAge(age)){
            System.out.println("Érvénytelen életkor adat, sikertelen regisztráció!");
            return;
        }

        Citizen citizen = new Citizen(name, zip, age, email, taj);

        if(!vd.registerCitizen(citizen)){
            System.out.println("Érvényes adatok, de az adatbázissal probléma lépett fel, kérjük próbálja meg később!");
        }
    }

    public void massRegister(VacDAO vd, Validator validator) {

        Path file;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a tömeges regisztráció fájljánal elérési útvonalát:");
        file = Path.of(scanner.nextLine());

        try(BufferedReader reader = Files.newBufferedReader(file)){

            String line = reader.readLine();
            String[] adat;
            int success = 0;
            int failed = 0;

            while((line = reader.readLine()) != null){
                adat = line.split(";");
                if(validator.isInvalidRecord(adat)){
                    System.out.println("Az alábbi adatok érvénytelenek, a regisztrációjuk sikertelen");
                    System.out.println(line);
                    failed++;
                    continue;
                }
                Citizen citizen = new Citizen(adat[0], adat[1], Integer.parseInt(adat[2]), adat[3], adat[4]);
                if(!vd.registerCitizen(citizen)){
                    System.out.println("Érvényes adatok, de az adatbázissal probléma lépett fel, kérjük próbálja meg később!");
                    failed++;
                    continue;
                }
                success++;
            }

            System.out.println(success + " sikeres regisztráció, és " + failed + " sikertelen!");

        } catch (IOException ioe) {
            System.out.println("A fájl nem található, vagy hibás, sikertelen regisztráció!");
            return;
        }

    }

    public void generate(VacDAO vd) {

        Path file;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg az elérését és a nevét az exportálandó fájlnak:");
        file = Path.of(scanner.nextLine());

        String zip;
        System.out.println("Kérem adja meg az irányítószámot:");
        zip = scanner.nextLine();

        List<Citizen> generatedCitizens = vd.generateVacQueueByZip(zip);

        try (BufferedWriter writer = Files.newBufferedWriter(file)){
            LocalTime time = LocalTime.of(8,0);
            writer.write("Időpont;Név;Irányítószám;Életkor;E-mail cím;TAJ szám");
            writer.newLine();
            for (Citizen citizen : generatedCitizens){
                String line = time.toString() + ";" + citizen.getName() + ";" + citizen.getZip() + ";" + citizen.getAge() + ";" + citizen.getEmail() + ";" + citizen.getTaj();
                writer.write(line);
                writer.newLine();
                time.plusMinutes(30);
                System.out.println(line);
            }

        }
        catch (IOException ioe) {
            System.out.println("A fájlt nem lehetett legeneráni, próbálja meg később!");
            return;
        }

    }

    public void vaccinate(VacDAO vd, Validator validator) {

        Scanner scanner = new Scanner(System.in);
        String taj;
        System.out.println("Kérem adja meg a Taj-számot:");
        taj = scanner.nextLine();

        if(validator.isInvalidTaj(taj)){
            System.out.println("Érvénytelen Taj-szám");
            return;
        }

        Citizen citizen = vd.getCitizenByTaj(taj);
        if(citizen == null){
            System.out.println("Személy nem található az adatbázisban.");
            return;
        }

        if(citizen.getNumber_of_vaccination() == 2){
            System.out.println("A személy túl van a második oltásá!");
            return;
        }

        if(citizen.getNumber_of_vaccination() == 1){
            String vacType = vd.getVaccinationTypeByTaj(taj);
            vd.updateLines(citizen, vacType, 2, "Megvalósult", "n.a.");
            return;
        }

        System.out.println("Kérem adja meg a választott vakcina típusát:");
        String vacType = scanner.nextLine();
        if(validator.isInvalidVaccineType(vacType)){
            System.out.println("Nem létező vakcina típus!");
            return;
        }
        vd.updateLines(citizen, vacType, 1, "Megvalósult", "n.a.");



    }

    public void failedVac(VacDAO vd, Validator validator) {

        Scanner scanner = new Scanner(System.in);
        String taj;
        System.out.println("Kérem adja meg a Taj-számot:");
        taj = scanner.nextLine();

        if(validator.isInvalidTaj(taj)){
            System.out.println("Érvénytelen Taj-szám");
            return;
        }

        Citizen citizen = vd.getCitizenByTaj(taj);
        if(citizen == null){
            System.out.println("Személy nem található az adatbázisban.");
            return;
        }

        System.out.println("Kérjük adja meg a meghiúsulás okát:");
        String note = scanner.nextLine();

        vd.updateLines(citizen, null, citizen.getNumber_of_vaccination(), "Meghiúsult", note);

    }


    public void report(VacDAO vd) {

        List<ZipReport> zipReports = new ArrayList<>();

        zipReports = vd.generateEmptyReports();
        vd.fillReport(zipReports);

        Path file;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg az elérését és a nevét az exportálandó fájlnak:");
        file = Path.of(scanner.nextLine());

        try (BufferedWriter writer = Files.newBufferedWriter(file)){
            writer.write("Irányítószám;0 oltást kapott;1 oltást kapott;2 oltást kapott");
            writer.newLine();
            for (ZipReport zr : zipReports){
                writer.write(zr.toCSVRow());
                writer.newLine();
                System.out.println(zr.toString());
            }

        }
        catch (IOException ioe) {
            System.out.println("A fájlt nem lehetett legeneráni, próbálja meg később!");
            return;
        }
    }


}
