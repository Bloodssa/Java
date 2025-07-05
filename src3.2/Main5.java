package Third;
import java.util.Scanner;

public class Main5 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int temporaryBalance = 1000;

        System.out.println("Enter account holder's name: ");
        String name = sc.nextLine();
        System.out.println("Enter account number: ");
        int accNumber = sc.nextInt();
        System.out.println("Account balance: " + temporaryBalance);
        System.out.println("\nEnter ammount to deposit: ");
        double deposit = sc.nextDouble();
        System.out.println("Deposited: " + deposit);
        System.out.println("\nEnter ammount to withdraw: ");
        double withdraw = sc.nextDouble();
        
        Bank bnk = new Bank(name, accNumber, deposit, withdraw);
        
        bnk.withdraw();
        bnk.accSummary();


        sc.close();

    }
}
