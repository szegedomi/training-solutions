package ioreader;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class IdManager {

    private List<String> ids = new ArrayList<>();

    public List<String> getIds() {
        return new ArrayList<>(ids);
    }

    public void readIdsFromFile(String filename){

        Path file = Path.of("C:/training/training-solutions/src/main/resources/" + filename);

        try (BufferedReader bufferedReader = Files.newBufferedReader(file)){
            String element;
            while((element = bufferedReader.readLine()) != null ){
                this.ids.add(element);
            }
        }
        catch(IOException ioe){
            throw new IllegalStateException("Cannot read file", ioe);
        }

    }

}
