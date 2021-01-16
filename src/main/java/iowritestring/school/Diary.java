package iowritestring.school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Diary {

    public void newMark(String name, int mark){
        try {
            Path file = Path.of(name + ".txt");
            if(Files.exists(file)){
                Files.writeString(file, Integer.toString(mark) + "\n", StandardOpenOption.APPEND);
            }
            else{
                Files.writeString(file, Integer.toString(mark));
            }
        }
        catch (IOException ioe){
            throw new IllegalStateException("Cannot write file", ioe);
        }
    }

    public void average(Path file){
        try{
            List<String> marks = Files.readAllLines(file);
            double result = 0;
            for (String mark : marks){
                result += Double.parseDouble(mark);
            }
            Files.writeString(file, "average: " + (result / marks.size()), StandardOpenOption.APPEND);
        }
        catch (IOException ioe){
            throw new IllegalStateException("Cannot read file", ioe);
        }

    }

}
