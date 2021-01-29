package week13.week13d04;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class TemplateMerger {

    public String merge(Path file, List<Employee> employees){
        String template = readTemplate(file);
        return writeString(template, employees).toString();
    }

    public String readTemplate(Path file){
        try(BufferedReader reader = Files.newBufferedReader(file)){
            return reader.readLine();
        }catch(IOException ioe){
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }


    public StringWriter writeString(String template, List<Employee> employees){
        StringWriter sw = new StringWriter();
        for(Employee employee : employees){
            sw.append(template.replace("{nev}", employee.getName()).replace("{ev}", Integer.toString(employee.getYearOfBirth())));
            sw.append("\n");
        }
        return sw;
    }

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 1980));
        employees.add(new Employee("Jack Doe", 1990));

        Path file = Path.of("src/main/resources/sablon.txt");

        System.out.println(new TemplateMerger().merge(file, employees));

    }

}
