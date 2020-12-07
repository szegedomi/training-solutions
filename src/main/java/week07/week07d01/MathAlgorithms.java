package week07.week07d01;

import static java.lang.Math.sqrt;

public class MathAlgorithms {

    public boolean isPrime(int x){
        if ( x < 1){
            throw new IllegalArgumentException("Input must be a positive integer!");
        }
        if(x == 1 || x == 2 || x == 3 || x==5 || x==7){return true;}
        if(x % 2 == 0){return false;}
        for (int i = 3; i < sqrt(x) ; i++){
            if(x % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

}
