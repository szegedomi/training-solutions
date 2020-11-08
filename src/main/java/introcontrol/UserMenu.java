package introcontrol;

import java.util.Scanner;

public class UserMenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Felhasználók listázása");
        System.out.println("2. Felhasznéló felvétele");
        System.out.println("Többi: Kilépés");
        System.out.println("Please select from menu by providing an integer");

        int number = scanner.nextInt();

        switch (number){
            case 1:
                System.out.println("Felhasználók listázása");
                break;
            case 2:
                System.out.println("Felhasznéló felvétele");
                break;
        }
    }
}
