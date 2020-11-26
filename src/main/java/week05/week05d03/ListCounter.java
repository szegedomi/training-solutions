package week05.week05d03;

import java.util.List;

public class ListCounter {

    public int countElementsWithA(List<String> strings){
        int result = 0;
        if(strings == null){return result;}
        for (String str : strings){
            if(!str.equals("") && str.toLowerCase().charAt(0) == 'a'){result++;}
        }
        return result;
    }

}
