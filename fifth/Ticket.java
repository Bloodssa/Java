package Fifth;

public enum Ticket {
    CHILD(80.00),
    STUDENT(150.00),
    ADULT(200.00),
    SENIOR(120.00);

    private double price; 

    private Ticket(double price) {
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

}
     