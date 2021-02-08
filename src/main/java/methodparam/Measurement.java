package methodparam;

public class Measurement {

    private double[] measurements;

    public Measurement(double[] measurements) {
        this.measurements = measurements;
    }

    public double[] getMeasurements() {
        return measurements;
    }

    public int findFirstIndexInLimit(int lower, int upper){
        for(int i = 0 ; i < measurements.length; i++){
            if(measurements[i] > lower && measurements[i] < upper){
                return i;
            }
        }
        return -1;
    }

    public double minimum(){
        double min =  Double.MAX_VALUE;
        for(double d : measurements){
            if (d< min){
                min = d;
            }
        }
        return min;
    }

    public double maximum(){
        double max =  -1 * Double.MIN_VALUE;
        for(double d : measurements){
            if (d > max){
                max = d;
            }
        }
        return max;
    }

    public ExtremValues minmax(){
        return new ExtremValues(this.minimum(), this.maximum());
    }

}
