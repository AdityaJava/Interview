package stream;


public class Employee {
    private Integer employeeId;
    private String name;

    private Integer age;
    private Integer experience;

    private Double salary;

    public Employee(Integer employeeId, String name, Integer age, Integer experience) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public Employee(Integer employeeId, String name, Integer age, Integer experience, Double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.salary = salary;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", salary=" + salary +
                '}';
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
