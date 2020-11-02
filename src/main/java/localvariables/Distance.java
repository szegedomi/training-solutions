package localvariables;

public class Distance {

    private double distanceinKm;
    private boolean exact;

    public Distance(double distanceinKm, boolean exact) {
        this.distanceinKm = distanceinKm;
        this.exact = exact;
    }

    public double getDistanceinKm() {
        return distanceinKm;
    }

    public boolean isExact() {
        return exact;
    }

}
