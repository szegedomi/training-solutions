package week11.week11d04;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSum {

    public int sumNumbers(){
        int result = 0;
        for (int i = 0; i< 100; i++){
            String filename = String.format("number%02d.txt", i);
            result += readInt(filename);
        }
        return result;
    }

    private int readInt(String filename){
        try {
            if (Files.isRegularFile(Path.of(filename))){
                return Integer.parseInt(Files.readString(Path.of(filename)));
            }
            return -1;
        }
        catch (IOException ioe){
            throw new IllegalStateException("Cannot read file", ioe);
        }
        catch (NumberFormatException nfe){
            throw new IllegalStateException("Format is not matching", nfe);
        }
    }

}
