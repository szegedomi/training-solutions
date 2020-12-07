package introinheritance;

public class Boss extends Employee{

    private static double LEADERSHIP_FACTOR = 0.1;
    private  int numberOfEmployees;

    public Boss(String name, String address, double salary, int numberOfEmployees) {
        super(name, address, salary);
        this.numberOfEmployees = numberOfEmployees;
        this.setSalary(salary + this.numberOfEmployees*LEADERSHIP_FACTOR*salary);
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }
}
