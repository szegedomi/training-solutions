package finalmodifier;

public class CylinderCalculator {

    public double calculateVolume(double r, double h){
        return r*r*h*CircleCalculator.PI;
    }


    public double calculateSurfacearea(double r, double h){
        return 2*r*h*CircleCalculator.PI;
    }

}
