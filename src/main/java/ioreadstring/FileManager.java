package ioreadstring;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private Path file;
    private List<Human> humans = new ArrayList<>();


    public FileManager(String file) {
        this.file = Path.of(file);
    }

    public Path getFile() {
        return file;
    }

    public List<Human> getHumans() {
        return humans;
    }

    public void readFromFile(){
        List<String> employees = new ArrayList<>();
        try {
            employees = Files.readAllLines(file);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        for(String str : employees){
            humans.add(new Human(str.split(" ")[0],str.split(" ")[1]));
        }
    }


}
