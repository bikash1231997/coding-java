import java.util.List;
import java.util.stream.Collectors;

/**
 * FindEmpAccJoiningYear
 * Find Employee who joined on specific year
 */
public class FindEmpAccJoiningYear {

    public static void main(String[] args) {
        Employee e = new Employee();
        List<Employee> employeeList = e.getEmployeeList();
        int year = 2018;
        List<Employee> collect = employeeList.stream().filter(t -> t.getJoinDate().getYear() == year)
                .collect(Collectors.toList());
        collect.forEach(t -> System.out.println("Employess who joined on " + year + " is " + t.getName()));
    }
}
