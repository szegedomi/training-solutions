package localvariables;

public class DistanceMain {

    public static void main(String[] args) {

        Distance distance = new Distance(234.25, true);
        System.out.println("Distance is:" + distance.getDistanceinKm() + ", which is exact:" + distance.isExact());

        int roundedDist = (int) distance.getDistanceinKm();

        System.out.println("integer part of the distance is:" + roundedDist);
    }

}
