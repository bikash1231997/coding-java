import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * FindMale&FemaleEmployee
 */
public class FindMaleAndFemaleEmployee {
    public static void main(String[] args) {
        Employee e = new Employee();
        List<Employee> empList = e.getEmployeeList();
        Map<String, Long> emp = empList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        emp.entrySet().forEach(t -> System.out.println(t.getKey() + " Having employess are: " + t.getValue()));
    }
}
