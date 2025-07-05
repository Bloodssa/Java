package Second;

public class Product {
    private String name;
    private String id;
    private double quantity;
    private double price;

    public Product(String name, String id, double quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }

    public void productDetails() {
        System.out.println("\n--- Product Details ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Total Value: " + calculateTotalValue());
    }

    public double calculateTotalValue() {
        return quantity * price;
    }

    public void addStock(int addedQuantity) {
        quantity += addedQuantity;
        System.out.println("Stock updated. New quantity: " + quantity);
    }
}
