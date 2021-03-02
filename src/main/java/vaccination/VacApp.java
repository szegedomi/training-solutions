package vaccination;

import java.util.Scanner;

public class VacApp {

    private void printMenu(){
        System.out.println("1. Regisztráció");
        System.out.println("2. Tömeges regisztráció");
        System.out.println("3. Generálás");
        System.out.println("4. Oltás");
        System.out.println("5. Oltás meghiúsulás");
        System.out.println("6. Riport");
        System.out.println("7. Kilépés");
    }

    private void runMenu(int menuPoint, Menu menu, VacDAO vd){
        switch (menuPoint){
            case 1:
                menu.register(vd);
                break;
            case 2:
                menu.massRegister(vd);
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

    private boolean isValidMenu(int menu){
        return menu > 0 && menu < 8;
    }

    public static void main(String[] args){

        VacApp va = new VacApp();
        VacDAO vd = new VacDAO();
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);

        va.printMenu();

        int menuPoint = va.selectMenu(scanner);

        while(menuPoint != 7){
            if(va.isValidMenu(menuPoint)){
                va.runMenu(menuPoint, menu, vd);
            }
            else{
                System.out.println("Nem létező menüpont, kérjük válasszon másikat!");
            }
            menuPoint = va.selectMenu(scanner);
        }

        System.out.println("Magyarország jobban teljesít!");


    }

}
