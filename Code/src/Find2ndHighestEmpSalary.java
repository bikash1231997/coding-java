import java.util.Collections;
import java.util.List;

/**
 * Find2ndHighestEmpSalary
 */
public class Find2ndHighestEmpSalary {

    public static void main(String[] args) {
        Employee e = new Employee();
        List<Employee> empList = e.getEmployeeList();
        Integer secondHighestSalary = empList.stream().map(Employee::getSalary).sorted(Collections.reverseOrder())
                .skip(1).findFirst().orElseThrow();
        System.err.println(secondHighestSalary);
    }
}
