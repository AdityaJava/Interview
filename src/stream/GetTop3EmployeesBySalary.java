package stream;

import java.util.List;

public class GetTop3EmployeesBySalary {
    public static void main(String[] args) {
        List<Employee> top3Salaries = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .collect(Collectors.toList());

    }
}
