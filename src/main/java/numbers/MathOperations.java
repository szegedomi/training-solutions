package numbers;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {

        System.out.println("Please solve the following problem!");
        System.out.println("((20/3 + 3) * 5) - 1");

        Scanner scanner = new Scanner(System.in);
        double solution = scanner.nextDouble();

        System.out.println(Math.abs((((20/3.0+3)*5)-1) - solution) < 0.0001);


    }

}
