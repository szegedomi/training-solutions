package inheritanceconstructor;

public class Jeep extends Car{

    private  double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    private boolean isThereEnoughFuelJeep(int km) {
        return ((super.getFuel() + extraFuel) > km * super.getFuelRate() / 100);
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    public void drive(int km){
        if(isThereEnoughFuelJeep(km)){
            double neededFuel = km * super.getFuelRate() / 100;
            extraFuel -= neededFuel;
            if(extraFuel < 0){
                modifyFuelAmount(extraFuel);
                extraFuel = 0;
            }
        }
    }

    public double calculateRefillAmount() {
        return (super.getTankCapacity() + extraCapacity) - (super.getFuel() + extraFuel);
    }

}
