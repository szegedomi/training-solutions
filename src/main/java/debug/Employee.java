package debug;

public class Employee {

    private String name;
    private int yearOfBirth;

    public Employee(String name, int year) {
        this.name = name;
        this.yearOfBirth = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return yearOfBirth;
    }
}
