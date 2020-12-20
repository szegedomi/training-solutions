package week08.week08d05;

import java.lang.Math;

public class MathAlgorithms {

    public int lnkoEuklid(int a, int b){
        if( a > b ? (a%b == 0) : (b%a==0)){
            return Math.min(a,b);
        }
        int maradek;
        int osztando = Math.max(a,b);
        int oszto = Math.min(a,b);
        do{
           maradek =  osztando % oszto;
           osztando = oszto;
           oszto = maradek;
        }while(maradek != 0);
        return osztando;
    }

}
