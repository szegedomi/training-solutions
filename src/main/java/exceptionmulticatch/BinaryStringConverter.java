package exceptionmulticatch;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String str){
        if(str == null){
            throw new NullPointerException("binaryString null");
        }
        boolean[] result = new boolean[str.length()];
        for(int i = 0; i < str.length(); i++){
            switch (str.charAt(i)){
                case '0':
                    result[i] = false;
                    break;
                case '1':
                    result[i] = true;
                    break;
                default:
                    throw new IllegalArgumentException("binaryString not valid");
            }
        }
        return result;
    }

    public String booleanToBinaryString(boolean[] bool){
        if(bool == null){
            throw new NullPointerException("binaryString null");
        }
        StringBuilder result = new StringBuilder();
        for (boolean b : bool){
            if(b){
                result.append("1");
            }
            else {
                result.append("0");
            }
        }
        return result.toString();
    }


}
