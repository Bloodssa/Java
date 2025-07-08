package Fifth;
import java.util.Scanner;

public class Main8 {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter delivery method (STANDARD, EXPRESS, SAMEDAY): ");
        String method = sc.nextLine();
        System.out.println("Enter distance in kilometers: ");
        double distance = sc.nextDouble();

        double priceRate = 0.00;
        boolean value = true;
        Delivery delivery = null;

        try {
            delivery = Delivery.valueOf(method.toUpperCase());

            switch(delivery) {
                case STANDARD:
                priceRate = delivery.getRate();
                break;
                case EXPRESS:
                priceRate = delivery.getRate();
                break;
                case SAMEDAY:
                priceRate = delivery.getRate();
            }
        }catch(IllegalArgumentException e) {
            value = false;
                System.out.println("Invalid delivery method entered. Please try again.");
            }
            Delivery d = Delivery.SAMEDAY;
            if (delivery == d) {
                Rate r = new Rate(method.toUpperCase(), priceRate, distance);
                r.totalOutputSameDay();
            } else if (value) {
            Rate r = new Rate(method.toUpperCase(), priceRate, distance);
                r.totalOutput();
        }


        sc.close();

    }
}
