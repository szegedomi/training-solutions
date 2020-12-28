package methodepass;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private List<Trooper> troopers= new ArrayList<>();

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper){
        this.troopers.add(trooper);
    }

    public void moveTrooperByName(String name, Position target){
        this.findTrooperByName(name).changePosition(target);
    }

    public void moveClosestTrooper(Position target){
        this.findClosestTrooper(target).changePosition(target);
    }


    private Trooper findTrooperByName(String name){
        for(Trooper trooper : troopers){
            if(trooper.getName().equals(name)){
                return trooper;
            }
        }
        return null;
    }

    private Trooper findClosestTrooper(Position target){
        double minDist = 99999999;
        int indexOfMin = 0;
        for(int i =0; i < troopers.size(); i++){
            if(troopers.get(i).distanceFrom(target) < minDist) {
                indexOfMin = i;
            }
        }
        return troopers.get(indexOfMin);
    }



}
