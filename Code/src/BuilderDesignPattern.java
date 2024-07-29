// construct complex objects step by step.
// use in spring security  SecurityFilterChain
public class Employee {

    private String name;
    private String company;

    private Employee(EmployeeBuilder employeeBuilder) {
        name = employeeBuilder.name;
        company = employeeBuilder.company;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public static class EmployeeBuilder {
        private String name;
        private String company;
       
        //constructor for required fields
        public EmployeeBuilder(String name, String company) {
            this.name = name;
            this.company = company;
        }

        //Build the Employee object
        public Employee build() {
            return new Employee(this);
        }
    }
}

class TestBuilder {
    public static void main(String[] args) {
        //Building the object of Employee thru the build() method provided in EmployeeBuilder class.
        Employee employee = new Employee.EmployeeBuilder("Vikram", "ABC").setHasBike(false).setHasBike(true).build();
    }
}
