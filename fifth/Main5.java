package Fifth;
import java.util.Scanner;

public class Main5 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter payment amount: ");
        double paymentAmount = sc.nextDouble();

        System.out.println("\nChoose payment method: ");
        System.out.println("1 - GCash");
        System.out.println("2 - PayMaya");
        System.out.println("3 - Crefit Card");

        int choice = sc.nextInt();


        Payment payment = null;

        switch (choice) {
            case 1: 
            payment = new Gcash();
            break;
            case 2:
            payment = new PayMaya();
            break;
            case 3:
            payment = new CreditCard();
            break;
            default:
            System.out.println("Invalid Payment Choice  \nPayment Unsuccessful!!!");
            sc.close();
            return;
        }

        payment.processPayment(paymentAmount);
        payment.paymentMethod();

        sc.close();

    }

}

