import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * FindEmployeeAccodingToTheDept
 */
public class FindEmployeeAccDept {

    public static void main(String[] args) {
        Employee e = new Employee();
        List<Employee> employeeList = e.getEmployeeList();
        Map<String, Long> collect = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        collect.entrySet().forEach(t -> System.out.println(t.getKey() + " " + t.getValue()));
    }
}
