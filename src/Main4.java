package First;
import java.util.Scanner;

public class Main4 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee name: ");
        String name = sc.nextLine();

        System.out.println("Enter position: ");
        String position = sc.nextLine();

        System.out.println("Enter daily rate: ");
        double rate = sc.nextDouble();

        System.out.println("Enter number of working days: ");
        double days = sc.nextDouble();

        sc.close();
        if (rate < 0 || days < 0) {
            System.out.println("Error: Daily rate and working days must be non-negative.");
            return;
        }

        Employee emp = new Employee(name, position, rate, days);
        emp.displayPayroll();

    }   
}
