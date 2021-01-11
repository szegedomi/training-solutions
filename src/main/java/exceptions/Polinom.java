package exceptions;

public class Polinom {

    private double[] egyutthatok;

    public Polinom(double[] egyutthatok) {
        if(egyutthatok == null){
            throw new NullPointerException("coefficients is null");
        }
        this.egyutthatok = egyutthatok;
    }

    public Polinom(String[] egyutthatok) {
        if(egyutthatok == null){
            throw new NullPointerException("coefficientStrs is null");
        }
        this.egyutthatok = new double[egyutthatok.length];
        for( int i = 0; i<egyutthatok.length; i++){
            try {
                this.egyutthatok[i] = Double.parseDouble(egyutthatok[i]);
            }
            catch (Exception e){
                throw new IllegalArgumentException("Illegal coefficients, not a number", e);
            }
        }

    }

    public double[] getEgyutthatok() {
        return egyutthatok;
    }

    public double evaluate(double x){
        double[] coeff = getEgyutthatok();
        int len = coeff.length;
        double result = 0;
        for (int i = 0; i<len; i++){
            result += Math.pow(x,len-1-i) * coeff[i];
        }
        return result;
    }

}
