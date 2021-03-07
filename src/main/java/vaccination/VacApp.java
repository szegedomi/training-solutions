package vaccination;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.util.Scanner;

public class VacApp {

    private void printMenu(){
        System.out.println("****************************");
        System.out.println("**** Oltási applikáció *****");
        System.out.println("****************************");
        System.out.println("1. Regisztráció");
        System.out.println("2. Tömeges regisztráció");
        System.out.println("3. Generálás");
        System.out.println("4. Oltás");
        System.out.println("5. Oltás meghiúsulás");
        System.out.println("6. Riport");
        System.out.println("7. Kilépés");
        System.out.println("****************************");
    }

    private void runMenu(int menuPoint, Menu menu, VacDAO vd, Validator validator){
        switch (menuPoint){
            case 1:
                menu.register(vd, validator);
                break;
            case 2:
                menu.massRegister(vd, validator);
                break;
            case 3:
                menu.generate(vd);
                break;
            case 4:
                menu.vaccinate(vd);
                break;
            case 5:
                menu.failedVac(vd);
                break;
            default:
                menu.report(vd);
        }
    }

    private int selectMenu(Scanner sc){
        System.out.println("Kérem válasszon a fenti menüből:");
        return sc.nextInt();
    }


    public static void main(String[] args){

        VacApp va = new VacApp();

        MariaDbDataSource dataSource;
        try{
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/vaccination?useUnicode=true");
            dataSource.setUser("vaccination");
            dataSource.setPassword("vaccination");
        }
        catch(SQLException se){
            throw new IllegalStateException("Nem tud csatlakozni az adatbázishoz!");
        }

        VacDAO vd = new VacDAO(dataSource);
        Validator validator = new Validator();
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);

        va.printMenu();

        int menuPoint = va.selectMenu(scanner);

        while(menuPoint != 7){
            if(validator.isValidMenu(menuPoint)){
                va.runMenu(menuPoint, menu, vd, validator);
            }
            else{
                System.out.println("Nem létező menüpont, kérjük válasszon másikat!");
            }
            va.printMenu();
            menuPoint = va.selectMenu(scanner);
        }

        System.out.println("Magyarország jobban teljesít!");


    }

}
