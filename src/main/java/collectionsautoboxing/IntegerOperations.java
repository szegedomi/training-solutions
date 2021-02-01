package collectionsautoboxing;

import java.util.ArrayList;
import java.util.List;

public class IntegerOperations {

    public List<Integer> createList(int... numbers){
        List<Integer> result = new ArrayList<>();
        for( int i : numbers){
            result.add(i);
        }
        return result;
    }

    public int sumIntegerList(List<Integer> integerList){
        int result = 0;
        for( int i : integerList){
            result += i;
        }
        return result;
    }

    public int sumIntegerObjects(Integer... integers){
        int result = 0;
        for( int i : integers){
            result += i;
        }
        return result;
    }

}
