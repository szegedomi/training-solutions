package week12.week12d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Enigma {

    public static void main(String[] args) {


        Path file = Path.of("src/main/resources/secret.dat");

        try {
            byte[] bytes = Files.readAllBytes(file);
            for(byte b : bytes){
                b+=10;
                System.out.print((char) b);
            }
        }
        catch (IOException ioe){
            throw new IllegalStateException("Cannot read file!");
        }

    }

}
