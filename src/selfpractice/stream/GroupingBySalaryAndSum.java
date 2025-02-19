package selfpractice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBySalaryAndSum {
    public static void main(String[] args) {
        groupBySalaryAndSum();
    }
    public static void groupBySalaryAndSum() {
        Employee employee = new Employee(1, "Aditya", 22, 4, 10900.0);
        Employee employee1 = new Employee(2, "Krishna", 22, 4, 10910.0);
        Employee employee2 = new Employee(3, "Narayan", 45, 12, 10900.0);
        Employee employee3 = new Employee(4, "Vithoba", 34, 9, 10910.0);
        Employee employee4 = new Employee(5, "Damodar", 27, 6, 10900.0);
        List<Employee> employeeList = Arrays.asList(employee1, employee, employee2, employee3, employee4);

        Map<Double, Double> salaryToDouble = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getSalary, Collectors.summingDouble(Employee::getSalary)));

        employeeList.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.summingDouble(Employee::getSalary)));
        System.out.println(salaryToDouble);
    }

}
