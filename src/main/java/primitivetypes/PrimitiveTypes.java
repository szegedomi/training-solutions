package primitivetypes;

public class PrimitiveTypes {

    public String toBinaryString(int n){
        String result="";
        while(n>0){
            result = n%2 + result;
            n /= 2;
        }
        return result;
    }

}
