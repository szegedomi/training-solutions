package week12.week12d03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NumberStat {

    public int smallestUniqueInt(List<Integer> ints){
        List<Integer> uniqueList = new ArrayList<>();
        List<Integer> repeatingList = new ArrayList<>();
        for (Integer i : ints){
            if(uniqueList.contains(i)){
                uniqueList.remove(i);
                repeatingList.add(i);
            }else if(!repeatingList.contains(i)){
                uniqueList.add(i);
            }
        }
        Integer min = Integer.MAX_VALUE;
        for(Integer i : uniqueList){
            if(i<min){
                min = i;
            }
        }
        return min;
    }

}
