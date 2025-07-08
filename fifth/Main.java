package Fifth;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a shape to calculate area: ");
        System.out.println( "1 - Circle");
        System.out.println("2 - Rectangle");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();

        Shape shape;

        if (choice == 1) {
            System.out.println("\nEnter radius: ");
            double radius = sc.nextDouble();

            shape = new Circle(radius);

        }
        else if (choice == 2) {
            System.out.println("\nEnter width: ");
            double width = sc.nextDouble();

            System.out.println("Enter width: ");
            double height = sc.nextDouble();

            shape = new Rectangle(width, height);
        }
        else {
            System.out.println("Invalid choice");
            sc.close();
            return;
        }

        shape.resultCalculation();

        sc.close();
    }
}