package week03.week03d02;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;

public class Position {

    private String name;
    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public String toString(){
        return "Name: " + name + ", bonus: " + bonus;
    }

    public static void main(String[] args) {

        List<Position> positions = new ArrayList<>();
        positions.add(new Position("John", 200_000));
        positions.add(new Position("Jane", 185_000));
        positions.add(new Position("Jack", 120_000));

        for(Position position : positions){
            if(position.getBonus() > 150_000){
                System.out.println(position.toString());
            }
        }

    }

}
