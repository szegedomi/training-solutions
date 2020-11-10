package finalmodifier;

public class PiMain {

    public static void main(String[] args) {

        CircleCalculator circleCalculator = new CircleCalculator();
        CylinderCalculator cylinderCalculator = new CylinderCalculator();

        System.out.println(circleCalculator.calculateArea(10));
        System.out.println(circleCalculator.calculatePerimeter(10));
        System.out.println(cylinderCalculator.calculateSurfacearea(10, 10));
        System.out.println(cylinderCalculator.calculateVolume(10, 10));

        System.out.println(CircleCalculator.PI);

    }
}
