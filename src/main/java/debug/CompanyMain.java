package debug;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        Company company = new Company(employees);

        company.addEmployee(new Employee("Domonkos", 1992));
        company.addEmployee(new Employee("Peter", 1993));


        System.out.println(company.listEmployeeNames().toString());

    }
}
