package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song song = new Song();

        System.out.println("Please provide data about your favorite song!");

        System.out.println("Please enter the band of the song:");
        song.band = scanner.nextLine();
        System.out.println("Please enter the title of the song:");
        song.title = scanner.nextLine();
        System.out.println("Please enter the length of the song in minutes:");
        song.length = scanner.nextInt();

        System.out.println(song.band + ", " + song.title + " (" + song.length + " perc)");
    }
}
