package week07.week07d05;

public class Truck extends Vehicle{

    public Truck(int numberOfGears, TransmissionType transmissionType) {
        super(numberOfGears, transmissionType);
    }

    public Truck(TransmissionType transmissionType) {
        super(5, transmissionType);
    }

    public Truck(int numberOfGears) {
        super(numberOfGears, TransmissionType.MANUAL);
    }

}
