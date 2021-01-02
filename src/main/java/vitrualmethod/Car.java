package vitrualmethod;

public class Car extends Vehicle{

    private int numberOfPassenger;

    public Car(int vehicleWeight, int numberOfPassenger) {
        super(vehicleWeight);
        this.numberOfPassenger = numberOfPassenger;
    }

    @Override
    public int getGrossLoad(){
        return super.getGrossLoad() + PERSON_AVERAGE_WEIGHT * numberOfPassenger;
    }

}
