package week07.week07d05;

public class Motorcycle extends Vehicle{

    public Motorcycle(int numberOfGears) {
        super(numberOfGears, TransmissionType.SEQUENTIAL);
    }

    public Motorcycle() {
        super(5, TransmissionType.SEQUENTIAL);
    }
}
