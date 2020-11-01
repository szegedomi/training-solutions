package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();

        System.out.println("Please enter your name:");
        client.name = scanner.nextLine();
        System.out.println("Please enter your year of birth ");
        client.year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter your address:");
        client.address = scanner.nextLine();

        System.out.println("Your name:");
        System.out.println(client.name);
        System.out.println("Your year of birth:");
        System.out.println(client.year);
        System.out.println("Your address:");
        System.out.println(client.address);
    }

}
