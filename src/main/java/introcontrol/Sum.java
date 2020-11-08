package introcontrol;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        int sum=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the 5 numbers that need to be summed up one after the other!");
        for(int i =0; i<5; i++) {
            System.out.println(i + 1 + ". number?");
            sum += scanner.nextInt();
        }

        System.out.println("The sum is: " + sum);




    }
}
