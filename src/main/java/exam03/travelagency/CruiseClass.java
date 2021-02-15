package exam03.travelagency;

public enum CruiseClass {

    LUXURY(3.0), FIRST(1.8), SECOND(1.0);

    private final double factor;

    CruiseClass(double factor){
        this.factor = factor;
    }

    public double getFactor() {
        return factor;
    }
}
