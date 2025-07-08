package Fifth;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter moviegoer type (CHILD, STUDENT, ADULT, SENIOR):");
        String type = sc.nextLine();

        

        try {
            Ticket ticket = Ticket.valueOf(type.toUpperCase());
            
            switch(ticket) {
                case CHILD:
                System.out.println("Moviegoer Type: " + Ticket.CHILD);
                System.out.println("Ticket Price: " + ticket.getPrice());
                break;
                case STUDENT:   
                System.out.println("Moviegoer Type: " + Ticket.STUDENT);
                System.out.println("Ticket Price: " + ticket.getPrice());
                break;
                case ADULT:
                System.out.println("Moviegoer Type: " + Ticket.ADULT);
                System.out.println("Ticket Price: " + ticket.getPrice());
                break;
                case SENIOR:
                System.out.println("Moviegoer Type: " + Ticket.SENIOR);
                System.out.println("Ticket Price: " + ticket.getPrice());
                break;
            }

        }catch(IllegalArgumentException e) {
            System.out.println("Invalid moviegoer type entered.");
        }
        sc.close();
    
    }
}
