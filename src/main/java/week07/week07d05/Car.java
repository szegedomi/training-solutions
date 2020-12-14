package week07.week07d05;

public class Car extends Vehicle{

    public Car(int numberOfGears) {
        super(numberOfGears, TransmissionType.AUTOMATIC);
    }

    public Car() {
        super(5, TransmissionType.AUTOMATIC);
    }

}
