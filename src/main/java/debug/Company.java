package debug;

import java.util.ArrayList;
import java.util.List;

public class Company {

    List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees=employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public Employee findEmployeeByName(String name){
        for(int i=0; i< employees.size(); i++){
            if(name == employees.get(i).getName()){
                return employees.get(i);
            }
        }
        return null;
    }

    public List<String> listEmployeeNames(){
        List<String> names = new ArrayList<>();
        for(int i=0; i< employees.size(); i++){
            names.add(employees.get(i).getName());
        }
        return names;
    }


}
