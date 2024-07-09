import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Employee {

    private Long id;
    private String name;
    private int salary;
    private String gender;
    private LocalDate joinDate;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public List<Employee> getEmployeeList() {

        Employee e1 = new Employee();
        e1.setId(1L);
        e1.setName("Hello");
        e1.setSalary(1000);
        e1.setGender("Female");
        e1.setJoinDate(LocalDate.of(2015, 8, 2));

        Employee e2 = new Employee();
        e2.setId(2L);
        e2.setName("Hello2");
        e2.setSalary(2000);
        e2.setGender("Male");
        e2.setJoinDate(LocalDate.of(2016, 8, 2));

        Employee e3 = new Employee();
        e3.setId(3L);
        e3.setName("Hello3");
        e3.setSalary(3000);
        e3.setGender("Female");
        e3.setJoinDate(LocalDate.of(2017, 8, 2));

        Employee e4 = new Employee();
        e4.setId(4L);
        e4.setName("Hello4");
        e4.setSalary(4000);
        e4.setGender("Female");
        e4.setJoinDate(LocalDate.of(2018, 8, 2));

        Employee e5 = new Employee();
        e5.setId(5L);
        e5.setName("Hello5");
        e5.setSalary(5000);
        e5.setGender("Male");
        e5.setJoinDate(LocalDate.of(2019, 8, 2));

        return Arrays.asList(e1, e2, e3, e4, e5);
    }

}
