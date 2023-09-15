package selfpractice.stream;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByPractice {

    public static void main(String[] args) {
        groupBy();

    }

    public static void groupBy() {
        Employee employee = new Employee(1, "Aditya",22,4);
        Employee employee1 = new Employee(2, "Krishna",22,4);
        Employee employee2 = new Employee(3, "Narayan",45,12);
        Employee employee3 = new Employee(4, "Vithoba",34,9);
        Employee employee4 = new Employee(5, "Damodar",27,6);

        List<Employee> employeeList = Arrays.asList(employee1,employee,employee2,employee3,employee4);

        Map<Integer, List<Employee>> ageToEmployee = employeeList.stream().collect(Collectors.groupingBy(Employee::getAge));
        ageToEmployee.keySet().stream().forEach(key ->{
            System.out.println(key+" "+ageToEmployee.get(key));
        });

    }


}
