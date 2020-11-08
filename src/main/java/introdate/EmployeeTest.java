package introdate;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the name of the Employee");
        String name = scanner.nextLine();
        System.out.println("Please provide the year of birth");
        int birthYear = scanner.nextInt();
        System.out.println("Please provide the month of birth");
        int birthMonth = scanner.nextInt();
        System.out.println("Please provide the day of birth");
        int birthDay = scanner.nextInt();

        Employee employee = new Employee(name, birthYear, birthMonth, birthDay);

        System.out.println("Employee's name: " + employee.getName());
        System.out.println("Employee's birth date: " + employee.getDateOfBirth());
        System.out.println("Start date and time of employment: " + employee.getBeginEmployment());

    }
}
