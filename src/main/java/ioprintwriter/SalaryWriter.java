package ioprintwriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SalaryWriter {

    private List<String> names = new ArrayList<>();

    public SalaryWriter(List<String> names) {
        this.names = names;
    }

    public void writeNamesAndSalaries(Path file){

        try(PrintWriter writer = new PrintWriter(Files.newBufferedWriter(file))){
            for(String name : names){
                writer.print(name);
                writer.print(": ");
                writer.println(getSalary(name));
            }
        }
        catch(IOException ioe) {
            throw new IllegalStateException("Cannot write file!");
        }
    }

    private int getSalary(String name){
        if(name.contains("Dr")){
            return 500000;
        }else if(name.contains("Mr") || name.contains("Mrs")){
            return 200000;
        }
        return 100000;
    }


}
