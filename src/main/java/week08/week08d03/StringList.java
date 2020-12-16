package week08.week08d03;

import java.util.ArrayList;
import java.util.List;

public class StringList {

    public List<String> stringListUnion(List<String> first, List<String> second){

        List<String> result = new ArrayList<>();

        for (String s : first){
            if(!result.contains(s)){
                result.add(s);
            }
        }

        for (String s : second ) {
            if (!result.contains(s)) {
                result.add(s);
            }
        }
        return result;
    }

}
