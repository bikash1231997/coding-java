import java.util.Arrays;
import java.util.List;

public class FindAvgSalryEmployee { 
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Employee e = new Employee();
        e.setId(1L);
        e.setName("Hello");
        e.setSalary(1000);
        Employee e2 = new Employee();
        e2.setId(2L);
        e2.setName("Hello2");
        e2.setSalary(2000);
        Employee e3 = new Employee();
        e3.setId(3L);
        e3.setName("Hello3");
        e3.setSalary(3000);
        Employee e4 = new Employee();
        e4.setId(4L);
        e4.setName("Hello4");
        e4.setSalary(4000);

        List<Employee> empList = Arrays.asList(e,e2,e3,e4);
        int total =0;
        System.out.println(empList.size());
        for (Employee employee : empList) {
            total += employee.getSalary(); 
        }
        System.out.println("Average Salary is :" + total/empList.size());

        // Using Stream Api
        double average = empList.stream().map(Employee::getSalary).mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println(average);
    }
}
