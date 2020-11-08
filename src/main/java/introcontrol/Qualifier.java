package introcontrol;

import java.util.Scanner;

public class Qualifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide an integer:");
        System.out.println("The provided number is " + (scanner.nextInt()>100 ? "greater than 100" : "less or equal to 100"));
    }
}
