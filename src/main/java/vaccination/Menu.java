package vaccination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
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
    }

    public void vaccinate(VacDAO vd) {
    }

    public void report(VacDAO vd) {
    }

    public void failedVac(VacDAO vd) {
    }

}
