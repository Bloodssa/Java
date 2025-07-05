package First;
import java.util.Scanner;

public class Main6 {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product name: ");
        String product = sc.nextLine();

        System.out.println("Enter product price: ");
        double price = sc.nextDouble();

        System.out.println("Enter quantity to order: ");
        int quantity = sc.nextInt();

        if (price <= 0 || quantity <= 0) {
            System.out.println("Invalid input. Price and quantity must be positive.");
            sc.close();
            return;
        }
        else {
            Order ord = new Order(product, price, quantity);
            ord.orderSummary();
        }

        sc.close();

    }
}
