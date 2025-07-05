package First;

public class Employee {
    private String name;
    private String position;
    private double rate;
    private double days;

    public Employee() {
        
    }

    //SETTERS
    public Employee(String name, String position, double rate, double days) {
        this.name = name;
        this.position = position;
        this.rate = rate;
        this.days = days;
    }
    //GETTERS 
    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public double getRate() {
        return rate;
    }
    public double getDays() {
        return days;
    }
    //OTHER METHODS
    public double totalSalary() {
        double salary = getRate() * getDays();
        return salary;
    }
    public void displayPayroll() {
        System.out.println("\n--- Employee Payroll Summary ---");
        System.out.println("Name: " + getName());
        System.out.println("Position: " + getPosition());
        System.out.println("Rate per Day: " + getRate());
        System.out.println("Working Days: " + getDays());
        System.out.println("Total Salary: " + totalSalary());
    }

}
