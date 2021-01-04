package week10.week10d01;

import java.util.List;

public class Hiking {

    public int getPlusElevation(List<Integer> heights){
        Integer result = 0;
        Integer diff;
        for (int i = 1 ; i<heights.size(); i++){
            diff = heights.get(i)-heights.get(i-1);
            if(diff > 0){
                result += diff;
            }
        }
        return (int) result;
    }

}
