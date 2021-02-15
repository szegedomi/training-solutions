package week15.week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CovidStat {

    private List<WeeklyCase> weeklyCases = new ArrayList<>();

    public void readFromFile(String file){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(CovidStat.class.getResourceAsStream(file)))) {
            String line = br.readLine();
            String[] data;
            while((line=br.readLine()) != null){
                if(line.contains(",Hungary,")){
                    data = line.split(",");
                    this.weeklyCases.add(new WeeklyCase(data[1], Integer.parseInt(data[2])));
                }
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }

    public List<String> getFirstWeeks(int weeks){
        List<WeeklyCase> sorted = new ArrayList<>(weeklyCases);
        Collections.sort(sorted);
        List<String> result = new ArrayList<>();
        for(int i = 0; i< weeks; i++){
            result.add(sorted.get(i).toString());
        }
        return result;
    }

    public static void main(String[] args) {

        CovidStat cs = new CovidStat();
        cs.readFromFile("/data.csv");

        List<String> result = cs.getFirstWeeks(3);

        for(String element : result){
            System.out.println(element);
        }

    }

}
