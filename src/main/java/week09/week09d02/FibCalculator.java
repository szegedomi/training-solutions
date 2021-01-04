package week09.week09d02;

import java.util.ArrayList;
import java.util.List;

public class FibCalculator {


    public long sumEvents(int bound){
        int index = 0;
        long num = 0;
        long result = 0;
        while(fib(index) < bound){
            num = fib(index);
            if(num % 2 == 0){
                result += num;
            }
            index++;
        }
        return result;
    }


    public long fib(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

}
