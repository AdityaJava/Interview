package selfpractice.stream;


public class Employee {
    private Integer employeeId;
    private String name;

    private Integer age;
    private Integer experience;

    public Employee(Integer employeeId, String name, Integer age, Integer experience) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.experience = experience;
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
                '}';
    }
}
