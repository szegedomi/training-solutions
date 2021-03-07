package week02;

import java.util.Scanner;

public class Controller {

    private Office office = new Office();

    public void readOffice(){

        System.out.println("Add meg a targyalok szamat!");
        Scanner scanner = new Scanner(System.in);

        int numb = scanner.nextInt();
        scanner.nextLine();

        String name;
        int length;
        int width;

        for (int i = 0; i< numb; i++){
            System.out.println("Add meg a(z) " + (i+1) + ". targyalo nevet:");
            name = scanner.nextLine();

            System.out.println("Add meg a targyalo hosszat:");
            length = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Add meg a targyalo szelesseget:");
            width = scanner.nextInt();
            scanner.nextLine();

            office.addMeetingRoom(new MeetingRoom(name, length, width));

        }
        System.out.println(office.getMeetingRooms());
    }

    public void printMenu(){
        System.out.println("1. Tárgyalók sorrendben\n" +
                "2. Tárgyalók visszafele sorrendben\n" +
                "3. Minden második tárgyaló\n" +
                "4. Területek\n" +
                "5. Keresés pontos név alapján\n" +
                "6. Keresés névtöredék alapján\n" +
                "7. Keresés terület alapján");
    }

    public void runMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which menu point would You like to execute?");
        int i = scanner.nextInt();
        scanner.nextLine();
        switch (i){
            case 1:
                office.printNames();
                break;
            case 2:
                office.printNamesReverse();
                break;
            case 3:
                office.printEvenNames();
                break;
            case 4:
                office.printAreas();
                break;
            case 5:
                System.out.println("What would be the name I shall look for?");
                office.printMeetingRoomsWithName(scanner.nextLine());
                break;
            case 6:
                System.out.println("What would be the namepart I shall look for?");
                office.printMeetingRoomsContains(scanner.nextLine());
                break;
            case 7:
                System.out.println("What would be area I shall look rooms greater than that for?");
                office.printAreasLargerThan(scanner.nextInt());
                break;
            default:
                System.out.println("Selected menu does not exist!");
        }
    }

    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.readOffice();
        controller.printMenu();
        controller.runMenu();

    }

}
