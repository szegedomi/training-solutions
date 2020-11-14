package intromethods;

public class Employee {

    private String name;
    private int hiringYear;
    private int salary;

    public Employee(String name, int hiringYear, int salary) {
        this.name = name;
        this.hiringYear = hiringYear;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getHiringYear() {
        return hiringYear;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void raiseSalary(int amount){
        salary += amount;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hiringYear=" + hiringYear +
                ", salary=" + salary +
                "} Hello!";
    }

    public static void main(String[] args) {

        Employee employee = new Employee("Jonh Doe", 1992, 100000);
        employee.raiseSalary(1000);
        System.out.println(employee.toString());


    }

}
