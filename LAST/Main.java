package Last;
import java.util.Scanner;

@FunctionalInterface
interface Math {
    int calculate(int a, int b);
}

public class Main {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Choose operation:\n1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        
        Math math = null;

            switch(choice) {
            case 1:
            math = (a, b) -> a+b;
            break;
            case 2:
            math = (a, b) -> a-b;
            break;
            case 3:
            math = (a, b) -> a*b;
            break;
            case 4:
            if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    sc.close();
                    return;
                }
            math = (a, b) -> a/b;
            break;
            default:
            System.out.println("Invalid operation choice.");
        }


        String [] choices = {"Addition", "Subtraction", "Multiplication", "Division"};
        int result = math.calculate(num1, num2);

        System.out.println("\nOperation: " + choices[(choice - 1)]);
        System.out.println("Result: " + result);
        

        sc.close();
    }
}
