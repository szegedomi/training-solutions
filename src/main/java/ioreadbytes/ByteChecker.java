package ioreadbytes;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ByteChecker {

    public int countAInBytes(){
        Path file = Path.of("src/main/resources/data.dat");
        int countA = 0;
        try (InputStream inputStream = Files.newInputStream(file)) {
            byte[] bytes = inputStream.readAllBytes();
            for(byte b : bytes){
                if(b == 'a'){
                    countA++;
                }
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return countA;
    }

    public static void main(String[] args) {

        System.out.println(new ByteChecker().countAInBytes());

    }


}
