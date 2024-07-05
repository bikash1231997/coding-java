import java.util.List;

/**
 * FindAvgSalaryOFMaleFemale
 */
public class FindAvgSalaryOFMaleFemale {
    public static void main(String[] args) {
        Employee e = new Employee();
        List<Employee> empList = e.getEmployeeList();
        double maleAvgSalary = empList.stream().filter(t -> t.getGender() == "Male").map(Employee::getSalary)
                .mapToInt(Integer::intValue).average().getAsDouble();
        double femaleAvgSalary = empList.stream().filter(t -> t.getGender() == "Female").map(Employee::getSalary)
                .mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("Male Avg Salary is : " + maleAvgSalary);
        System.out.println("Female Avg Salary is : " + femaleAvgSalary);
    }

}
