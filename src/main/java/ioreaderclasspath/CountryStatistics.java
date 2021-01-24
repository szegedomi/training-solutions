package ioreaderclasspath;

import com.sun.jdi.IncompatibleThreadStateException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {

    private List<Country> countries = new ArrayList<>();

    public void readFromFile(String file){

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                CountryStatistics.class.getResourceAsStream(file)))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] splitline = line.split(" ", 2);
                this.countries.add(new Country(splitline[0], Integer.parseInt(splitline[1])));
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public int numberOfCountriesRead(){
        return countries.size();
    }

    public String countryWithMostNeighbours(){
        Country maxNeighbours = null;
        int max = 0;
        for(Country c : this.countries){
            if(c.getNeighbours() > max){
                max = c.getNeighbours();
                maxNeighbours = c;
            }
        }
        return maxNeighbours.getName();
    }

    public static void main(String[] args) {

        CountryStatistics cs = new CountryStatistics();

        cs.readFromFile("/country.txt");

        System.out.println("Number of countries read: " + cs.numberOfCountriesRead());

        System.out.println("Country with the most neighbours is: " + cs.countryWithMostNeighbours());

    }


}
