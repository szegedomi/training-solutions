package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This Calculator will sum up two integers. Please provide two integers!");
        System.out.println("What shell be the first integer?");
        int int1 = scanner.nextInt();
        System.out.println("What shell be the second integer?");
        int int2 = scanner.nextInt();

        System.out.println(int1 + " + " + int2);
        System.out.println(int1+int2);


    }
}
