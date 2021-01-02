package vitrualmethod;

public class Van extends Car{

    private int cargoWeight;

    public Van(int vehicleWeight, int numberOfPassenger, int cargoWeight) {
        super(vehicleWeight, numberOfPassenger);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public int getGrossLoad(){
        return super.getGrossLoad() + this.cargoWeight;
    }

}
