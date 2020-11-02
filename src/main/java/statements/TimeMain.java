package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {

        System.out.println("Please provide me two time data!");

        int hours;
        int minutes;
        int seconds;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is he hours part of the first appointment");
        hours = scanner.nextInt();
        System.out.println("What is he hours part of the first appointment");
        minutes = scanner.nextInt();
        System.out.println("What is he hours part of the first appointment");
        seconds = scanner.nextInt();

        Time time1 = new Time(hours, minutes, seconds);

        System.out.println("What is he hours part of the second appointment");
        hours = scanner.nextInt();
        System.out.println("What is he hours part of the second appointment");
        minutes = scanner.nextInt();
        System.out.println("What is he hours part of the second appointment");
        seconds = scanner.nextInt();

        Time time2 = new Time(hours, minutes, seconds);

        System.out.println("Az elso idopont " + time1.toString() + " = " + time1.getInMinutes() + " perc");
        System.out.println("Az masodik idopont " + time2.toString() + " = " + time2.getInSeconds() + " masodperc");
        System.out.println("Az elso idopont korabbi, mint a masodik: " + time1.earlierThan(time2));


    }
}
