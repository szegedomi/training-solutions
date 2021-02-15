package week15.week15d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameOfThrones {

    public Map<String, Integer> readBattlesPerHouse(Reader r){
        Map<String, Integer> numberOfBattlesPerHouse = new HashMap<>();
        try(BufferedReader reader = new BufferedReader(r)) {
            String line;
            String[] data;
            String house;
            reader.readLine();
            while((line = reader.readLine()) != null){
                data = line.split(",");
                List<String> houseInBatlle = new ArrayList<>();
                for(int i=0; i<8; i++){
                    house = data[i+5];
                    if(!house.isBlank()){
                        if(numberOfBattlesPerHouse.containsKey(house)){
                            numberOfBattlesPerHouse.put(house, numberOfBattlesPerHouse.get(house)+1);
                        }
                        else{
                            numberOfBattlesPerHouse.put(house, 1);
                        }
                    }

                }
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
        return numberOfBattlesPerHouse;
    }

    public String getHouseWithMostBattles(Map<String, Integer> battlesPerHouse){
        String result = null;
        int maxBattle = 0;
        for(Map.Entry<String, Integer> entry : battlesPerHouse.entrySet()){
            if(entry.getValue() > maxBattle){
                maxBattle = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }

    public static void main(String[] args) {

        GameOfThrones gameOfThrones = new GameOfThrones();
        System.out.println(gameOfThrones.getHouseWithMostBattles(gameOfThrones.readBattlesPerHouse(new InputStreamReader(GameOfThrones.class.getResourceAsStream("/battles.csv")))));

    }

}
