package week07.week07d02;

import java.util.Scanner;

public class DigitSum {

    public int sumOfDigits(int x){
        int result = 0;
        while( x / 10 > 0){
            result += x % 10;
            x = x / 10;
        }
        result += x % 10;
        return result;
    }

}
