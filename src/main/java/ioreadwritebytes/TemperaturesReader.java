package ioreadwritebytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesReader {

    public Temperatures readTemperatures(String pathString){
        Path file = Path.of(pathString);
        try {
            byte[] bytes = Files.readAllBytes(file);
            return new Temperatures(bytes);
        }
        catch(IOException ioe){
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }

}
