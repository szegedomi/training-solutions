package methodvarargs;

public class ExamStats {

    private int maxPoint;

    public ExamStats(int maxPoint) {
        this.maxPoint = maxPoint;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results){
        if(results == null || results.length == 0){
            throw new IllegalArgumentException("There are no results to evaluate!");
        }
        int result = 0;
        for (int i : results){
            if( i > this.maxPoint*limitInPercent/100 ){
                result++;
            }
        }
        return result;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results){
        if(results == null || results.length == 0){
            throw new IllegalArgumentException("There are no results to evaluate!");
        }
        for(int i : results){
            if (i < this.maxPoint*limitInPercent/100){
                return true;
            }
        }
        return false;
    }

}
