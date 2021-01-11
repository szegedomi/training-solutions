package week11.week11d01;

public class DivisorFinder {

    public int findDivisors(int n){

        int result = 0;
        for(int i = 0; i < String.valueOf(n).length(); i++){
            if( n % ( Character.getNumericValue(String.valueOf(n).charAt(i))) == 0){
                result++;
            }
        }
        return result;
    }

}
