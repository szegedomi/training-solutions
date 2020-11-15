package introexception;

public class SsnValidator {

    public boolean isValidSsn(String ssn){
        if(ssn.length()<9){return false;}
        int puff=0 ;
        for (int i =0; i < 8; i++) {
            if(((i+1) % 2) == 1){
                puff += (Character.getNumericValue(ssn.charAt(i))) * 3;
            }
            else{
                puff += (Character.getNumericValue(ssn.charAt(i))) * 7;
            }
        }
        return (puff % 10) == (Character.getNumericValue(ssn.charAt(8)));
    }

}
