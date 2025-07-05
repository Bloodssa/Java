package Second;
import java.util.*;

public class BankAccount {
    private Scanner sc;
    private String name;
    private double finalBalance = 0;


    public void inputHandler(Scanner sc) {
        this.sc = sc;
    }

    public void userName() {
        System.out.println("Enter account holder name: ");
        name = sc.nextLine();
    }
    public void deposit(){
        System.out.println("Enter amount to deposit: ");
        double amount  = sc.nextDouble();
        if (amount > 0) {
            finalBalance += amount;
        }
        else {
            System.out.println("Invalid deposit ammount");
        }
     }
    public void withdraw(){
        System.out.println("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (amount > 0 && amount <= finalBalance) {
            finalBalance -= amount;
        }
        else {
            System.out.println("Invalid amount to withdraw");
        }
    }
    public void displayBlance(){

        System.out.println("\n\n--- Account Summary ---");
        System.out.println("Name: " + name);
        System.out.println("Current Balance: " + finalBalance);
    }
}
