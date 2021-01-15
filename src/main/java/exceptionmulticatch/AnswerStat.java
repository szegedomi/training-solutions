package exceptionmulticatch;

public class AnswerStat {

    private BinaryStringConverter bSC;

    public AnswerStat(BinaryStringConverter bSC) {
        this.bSC = bSC;
    }

    public boolean[] convert(String str){
        boolean[] result;
        try {
            result = bSC.binaryStringToBooleanArray(str);
        }
        catch (NullPointerException | IllegalArgumentException   e) {
            throw new  InvalidBinaryStringException(e.getMessage(), e);
        }
        return result;
    }

    public int answerTruePercent(String answers){
        boolean[] ans = convert(answers);
        int numTrue = 0;
        for(boolean b : ans){
            if(b){
                numTrue++;
            }
        }
        return numTrue * 100 / ans.length;

    }






}
