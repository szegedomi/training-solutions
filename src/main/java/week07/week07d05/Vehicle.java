package week07.week07d05;

public class Vehicle {

    private int numberOfGears;
    private TransmissionType transmissionType;

    public Vehicle(int numberOfGears, TransmissionType transmissionType) {
        this.numberOfGears = numberOfGears;
        this.transmissionType = transmissionType;
    }

    public int getNumberOfGears(){
        return numberOfGears;
    }

    public TransmissionType getTransmissionType(){
        return transmissionType;
    }

}
