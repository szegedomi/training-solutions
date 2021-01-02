package vitrualmethod;

public class Vehicle {

    private int vehicleWeight;
    final static int PERSON_AVERAGE_WEIGHT = 75;

    public Vehicle(int vehicleWeight) {
        this.vehicleWeight = vehicleWeight;
    }

    public int getGrossLoad(){
        return this.vehicleWeight + this.PERSON_AVERAGE_WEIGHT;
    }



}
