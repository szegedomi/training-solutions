package exam02.arraySelector;

import java.util.ArrayList;
import java.util.List;

public class ArraySelector {

    public String selectEvens(int[] integers){
        if(integers.length == 0){
            return "";
        }
        int elements = (integers.length+1)/2;
        String result = "[";
        for ( int i =0; i < elements ; i++){
            result += integers[2*i];
            result += ", ";
        }
        result = result.substring(0,result.length()-2);
        return result + "]";
    }


}
