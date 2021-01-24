package week12.week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Index {

    public static void main(String[] args) {

        int count = 0;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                Index.class.getResourceAsStream("/Index.html")))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if(line.toLowerCase().contains("koronavírus")){
                    count++;
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

        System.out.println(String.format("Koronavírus szó megtalálva %d sorban", count));


    }
}
