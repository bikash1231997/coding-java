import java.util.List;

/**
 * IncrementEployeeSalary
 */
public class IncrementEployeeSalary {

    public static void main(String[] args) {
        Employee e = new Employee();
        List<Employee> employeeList = e.getEmployeeList();
        int incrementPetcentage = 10;
        employeeList.forEach(t -> System.out.print(t.getSalary()));
        employeeList.stream().forEach(t -> t.setSalary(t.getSalary() + (t.getSalary() * incrementPetcentage / 100)));
        System.out.println();
        employeeList.forEach(t -> System.out.print(t.getSalary()));
    }
}
