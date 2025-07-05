package Third;

public class Bank {
    private String name;
    private int accNumber;
    private double deposit;
    private double withdraw;
    private int balance = 1000;
    private double totalBalance;
    private double currentBalance;

    public Bank(String name, int accNumber, double deposit, double withdraw) {
        this.name = name;
        this.accNumber = accNumber;
        this.deposit = deposit;
        this.withdraw =withdraw;
    }
    public void withdraw() {
        totalBalance = balance + this.deposit;

        if(this.withdraw > totalBalance) {
            System.out.println("Insufficient balance! Withdrawal denied.");
            currentBalance = totalBalance;
        }else {
            System.out.println("Withdrawn: " + this.withdraw);
            currentBalance =  totalBalance - this.withdraw;
        }
    }
    public void accSummary() {
        System.out.println("\nBank Account Summary");
        System.out.println("Account Holder: " + this.name);
        System.out.println("Account Number: " + this.accNumber);
        System.out.println("Current Balance: " + currentBalance);

    }

}
