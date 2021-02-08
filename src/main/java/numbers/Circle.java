package numbers;

import java.util.Scanner;

public class Circle {

    private int diameter;
    private static double PI = 3.14;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    public double perimeter(int diameter){
        return diameter/2.0*2*PI;
    }
    public double area(int diameter){
        return diameter/2.0*diameter/2*PI;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Circle circle = new Circle(20);

        System.out.println("Please provide the diameter of the circle:");
        int diameter = scanner.nextInt();

        System.out.println("Area is: " + circle.area(diameter));
        System.out.println("Perimeter is: " + circle.perimeter(diameter));

    }
}
