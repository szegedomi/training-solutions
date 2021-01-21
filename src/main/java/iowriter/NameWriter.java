package iowriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class NameWriter {

    private List<String> names = new ArrayList<>();
    private Path file;

    public NameWriter(Path file) {
        this.file = file;
    }

    public void addAndWrite(String name){

        this.names.add(name);
        try(BufferedWriter writer = Files.newBufferedWriter(file, StandardOpenOption.APPEND)){
            writer.write(name + "\n");
        }catch(IOException ioe){
            throw new IllegalStateException("Cannot write file!");
        }

    }

}
