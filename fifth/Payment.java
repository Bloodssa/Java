package Fifth;

public interface Payment {
    double processPayment(double amount);
    void paymentMethod();
}

class Gcash implements Payment{
    private double amount;

    @Override
    public double processPayment(double amount) {
        this.amount =amount;
        return amount;
    }

    @Override
    public void paymentMethod() {
        System.out.println("Processing Gcash payment of ₱" + amount);
        System.out.println("GCash successful via PayMaya!");
    }
}

class PayMaya implements Payment{
    private double amount;

    @Override
    public double processPayment(double amount) {
        this.amount =amount;
        return amount;
    }

    @Override
    public void paymentMethod() {
        System.out.println("Processing PayMaya payment of ₱" + amount);
        System.out.println("Payment successful via PayMaya!");
    } 
}

class CreditCard implements Payment{
    private double amount;

    @Override
    public double processPayment(double amount) {
        this.amount =amount;
        return amount;
    }

    @Override
    public void paymentMethod() {
        System.out.println("Processing Credit Card payment of ₱" + amount);
        System.out.println("Credit Card successful via PayMaya!");
    } 
}
