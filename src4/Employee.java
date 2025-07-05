package Fourth;

public abstract class Employee {
    protected String name;
    protected String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();

    public void display() {
        System.out.println("\n=== Employee Details ===");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

// SUBCLASS
class FullTimeEmployee extends Employee {
    private double salary;
    private double bonus;

    public FullTimeEmployee(String name, String id, double salary, double bonus) {
        super(name, id);
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return salary + bonus;
    }
}

// SUBCLASS
class PartTimeEmployee extends Employee {
    private double rate;
    private double hours;

    public PartTimeEmployee(String name, String id, double rate, double hours) {
        super(name, id);
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public double calculateSalary() {
        return rate * hours;
    }
}