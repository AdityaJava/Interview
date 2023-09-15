package zymr;

import java.util.HashMap;
import java.util.Map;

public class Zymr {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"Aditya");
        Employee employee1 = new Employee(2,"Krishna");
        Employee employee2 = new Employee(3,"Narayan");
        Employee employee3 = new Employee(4,"Vithoba");
        Employee employee4 = new Employee(5,"Damodar");

        Map<Employee, Integer> employeeIntegerMap= new HashMap<>();
        employeeIntegerMap.put(employee, 1);
        employeeIntegerMap.put(employee1, 2);
        employeeIntegerMap.put(employee2, 3);
        employeeIntegerMap.put(employee3, 4);
        employeeIntegerMap.put(employee4, 5);

        System.out.println(employeeIntegerMap.get(employee4));
    }
}
