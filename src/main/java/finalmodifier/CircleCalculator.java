package finalmodifier;

public class CircleCalculator {

    public static final double PI = Math.PI;

    public double calculatePerimeter(double r){
        return 2*r*PI;
    }

    public double calculateArea(double r){
        return r*r*PI;
    }

}
