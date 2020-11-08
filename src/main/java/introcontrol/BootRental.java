package introcontrol;

import java.util.Scanner;

public class BootRental {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many of you would like to sail?");

        int participants = scanner.nextInt();

        switch (participants){
            case 1:
                System.out.println("You get the boot for 2 people with 1 extra seat, still available 8 seats in two boots");
                break;
            case 2:
                System.out.println("You get the boot for 2 people, still available 8 seats in two boots");
                break;
            case 3:
                System.out.println("You get the boot for 3 people, still available 7 seats in two boots");
                break;
            case 4:
                System.out.println("You get the boot for 5 with 1 extra seat, still available 5 seats in two boots");
                break;
            case 5:
                System.out.println("You get the boot for 5 people, still available 8 seats in two boots");
                break;
            case 6:
                System.out.println("You get two boots for 2 and 5 people with 1 extra seat, still available 3 seats in one boots");
                break;
            case 7:
                System.out.println("You get two boots for 2 and 5 people, still available 3 seats in one boots");
                break;
            case 8:
                System.out.println("You get two boots for 3 and 5 people, still available 2 seats in one boots");
                break;
            case 9:
                System.out.println("You get all the boots with 1 extra seat, no more boots available");
                break;
            case 10:
                System.out.println("You get all the boots, no more boots available");
                break;
            default:
                System.out.println("You get all the boots, remaining people waiting for free seats: " + (participants - 10));
        }

    }

}
