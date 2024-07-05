import java.util.List;

public class FindAvgSalryEmployee {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Employee e = new Employee();
        List<Employee> empList = e.getEmployeeList();
        int total = 0;
        System.out.println(empList.size());
        for (Employee employee : empList) {
            total += employee.getSalary();
        }
        System.out.println("Average Salary is :" + total / empList.size());

        // Using Stream Api
        double average = empList.stream().map(Employee::getSalary).mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println(average);
    }
}
