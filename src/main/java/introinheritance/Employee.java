package introinheritance;

public class Employee extends Person{

    private double salary;

    public Employee(String name, String address, double salary){
        super(name, address);
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double raise){
        this.setSalary(this.salary+raise);
    }

}
