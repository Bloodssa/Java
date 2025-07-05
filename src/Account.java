package First;

public class Account {
    private String name;
    private double balance;

    //SETTERS
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    //GETTERS
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    
    //OTHER  METHODS
    public double deposit(double deposit) {
        balance += deposit;
        return balance;
    }
    public double withdraw(double withdraw) {
        if(balance > 0) {
            System.out.println("Insufficient, you cannot withdraw");
        }
        else{
            balance -= withdraw;
        }
        return balance;
    }
    public void overallBalance() {
        System.out.println("\n--- Account Summary ---");
        System.out.println("Name: " + getName());
        System.out.println("Balance: " + getBalance());
    }

    
}
