package inheritanceconstructor;

public class Car {

    private double fuelRate;
    private double fuel;
    private double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public void modifyFuelAmount(double fuel){
        this.fuel += fuel;
    }

    public void drive(int km){
        if(isThereEnoughFuel(km)){
            fuel -= km * fuelRate/100;
        }
    }

    public double calculateRefillAmount(){
        return this.tankCapacity-this.fuel;
    }

    private boolean isThereEnoughFuel(int km){
        if ((double) km < fuel/fuelRate*100){
            return true;
        }
        return false;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }
}
