package First;
import java.util.Scanner;

public class Main3 {
    public static void main(String []args) {
        Scanner sc = new  Scanner(System.in);

        System.out.println("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.println("Enter initial balance: ");
        double balance = sc.nextDouble();

        Account act = new Account(name, balance);

        System.out.println("\nEnter amount to deposit: ");
        double deposit = sc.nextDouble();

        act.deposit(deposit);

        System.out.println("\nEnter amount to withdraw: ");
        double withdraw = sc.nextDouble();

        act.withdraw(withdraw);
        act.overallBalance();


        sc.close();
        
    }

}
