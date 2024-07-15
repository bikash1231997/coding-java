import java.util.List;
import java.util.stream.Collectors;

/**
 * Find Employee whose Name Starts With
 */
public class NameStartsWith {

    public static void main(String[] args) {
        Employee e = new Employee();
        List<Employee> employeeList = e.getEmployeeList();
        List<String> nameStarsWith = employeeList.stream().filter(t -> t.getName().startsWith("A"))
                .map(Employee::getName)
                .collect(Collectors.toList());
        for (String name : nameStarsWith) {
            System.out.println(name);
        }
    }
}

