package Fifth;
import java.util.Scanner;

abstract class Notifacation {
    public abstract void send(String message);
}

public class Main4 {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter message to send: ");
        String message = sc.nextLine();

        System.out.println("\nChoose notifacation type: ");
        System.out.println("1 - Email");
        System.out.println("2 - SMS");
        System.out.println("3 - Push Notifacation");

        int choice = sc.nextInt();

        // ANONYMOUS CLASS
        Notifacation notify = new Notifacation() {
            @Override
            public void send(String message) {
                switch(choice) {
                    case 1: 
                    System.out.println("\nEmail Notifacation Sent!");
                    break;
                    case 2: 
                    System.out.println("\nSMS Notifacation Sent!");
                    break;
                    case 3:
                    System.out.println("\nPush Notifacation Sent!");
                    break;
                    default:
                    System.out.println("\nOther notifacation Sent!");
                    break;
                }
                System.out.println("Meesage: " + message);
            }
        };

        notify.send(message);
        sc.close();        

    }
}
