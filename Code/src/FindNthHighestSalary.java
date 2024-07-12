import java.util.Collections;
import java.util.List;

/**
 * FindNthHighestSalary
 */
public class FindNthHighestSalary {

    public static void main(String[] args) {
        Employee e = new Employee();
        List<Employee> empList = e.getEmployeeList();
        int nthNumber = 2;
        Integer nthHighestSalary = empList.stream().map(Employee::getSalary).sorted(Collections.reverseOrder())
                .skip(nthNumber - 1).findFirst().orElseThrow();
        System.out.println(nthHighestSalary);
    }
}
