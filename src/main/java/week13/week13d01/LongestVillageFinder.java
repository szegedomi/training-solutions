package week13.week13d01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LongestVillageFinder {

    public String findLongestVillage(){
        try(BufferedReader br = new BufferedReader(new FileReader("src/main/resources/iranyitoszamok-varosok-2021.csv"))){

            String result = "";
            String line;
            line = br.readLine(); //reading header
            String village;
            while((line = br.readLine()) != null){
                village = line.split(";", 3)[1];
                if(village.length() > result.length()){
                    result = village;
                }
            }
            return result;
        }catch(IOException ioe){
            throw new IllegalStateException("Cannot read file!", ioe);
        }

    }

    public static void main(String[] args) {

        System.out.println(new LongestVillageFinder().findLongestVillage());

    }

}
