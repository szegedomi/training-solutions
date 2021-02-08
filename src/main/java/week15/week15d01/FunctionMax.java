package week15.week15d01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionMax {

    public double[] maxCoordinate(Map<Double, Double> function){
        double result = -1;
        double max = -1 * Double.MAX_VALUE;
        for(Double key : function.keySet()){
            if(function.get(key) > max){
                result = key;
                max = function.get(key);
            }
        }
        return new double[]{result, max};
    }

    public static void main(String[] args) {

        Map<Double, Double> function = new HashMap<>();
        function.put(0.0,-10.0);
        function.put(1.0,5.0);
        function.put(2.0,9.0);
        function.put(3.0,12.0);
        function.put(4.0,6.0);
        function.put(5.0,-7.0);

        System.out.println(new FunctionMax().maxCoordinate(function)[0] + " " + new FunctionMax().maxCoordinate(function)[1]);


    }

}
