package Third;

public class Main2 {
    public static void main (String []args) {
        Employee employee = new Employee("John Doe", "Software Developer", 800, 22);

        employee.displayEmployee();
        System.out.println("Total Salary: "+ employee.totalSalary());
        
    }
}
