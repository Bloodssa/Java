package Second;
import java.util.Scanner;

public class Main4 {
        public static void main(String []args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Product Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Product ID: ");
            String id = sc.nextLine();
            System.out.println("Enter Quantity: ");
            int quantity = sc.nextInt();
            System.out.println("Enter Price: ");
            double price = sc.nextDouble();

            Product prod = new Product(name, id, quantity, price);

            prod.productDetails();
            prod.calculateTotalValue();

            System.out.println("\nEnter quantity to add to stock");
            int addQuantity = sc.nextInt();

            prod.addStock(addQuantity);

            sc.close();
        }
}
