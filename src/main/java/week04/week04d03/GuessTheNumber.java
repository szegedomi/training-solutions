package week04.week04d03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while(i < 6){
            System.out.println("What is your guess?");
            if(scanner.nextInt() == number){
                System.out.println("You won");
                return;
            }
            i++;
        }
        System.out.println("Sorry, you lost!");
    }



}
