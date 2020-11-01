package classstructureio;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Please enter your email address:");
        String email = scanner.nextLine();

        System.out.println("Congratulations!");
        System.out.println("You have successfully registered to our database with name: " + name + " and email address: " + email + ".");

    }
}
