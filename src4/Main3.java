package Fourth;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees do you want to enter? ");
        int numberOfEmployees = sc.nextInt();
        sc.nextLine(); 

        Employee[] employees = new Employee[numberOfEmployees];

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("\nEnter Employee Type (1 - Full Time, 2 - Part Time): ");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee ID: ");
            String id = sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Basic Salary: ");
                double salary = sc.nextDouble();

                System.out.print("Enter Monthly Bonus: ");
                double bonus = sc.nextDouble();

                employees[i] = new FullTimeEmployee(name, id, salary, bonus);
            } else if (choice == 2) {
                System.out.print("Enter Hourly Rate: ");
                double rate = sc.nextDouble();

                System.out.print("Enter Hours Worked: ");
                double hours = sc.nextDouble();

                employees[i] = new PartTimeEmployee(name, id, rate, hours);
            } else {
                System.out.println("Invalid choice. Skipping this entry.");
                i--; 
                continue;
            }
        }

        sc.close();

        System.out.println("\n========= Employee Summary =========");
        for (Employee emp : employees) {
            emp.display();
        }
    }
}
