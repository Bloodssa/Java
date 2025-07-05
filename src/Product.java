package First;
//SUPER CLASS
public class Product {
        private String product;
        private double price;
        private int quantity;
        
        // NOT PARAMITIRIZED CONSTRUCTOR
        public Product() {}

        // PARAMITIRIZED CONSTRUCTOR AND FOR SETTERS
        public Product(String product, double price, int quantity) {
            this.product = product;
            this.price = price;
            this.quantity = quantity;
        }
        public String getProduct() {
            return product;
        }
        public double getPrice() {
            return price;
        }
        public int getQuantity() {
            return quantity;
        }
        
}

//SUB CLASS
class Order extends Product{

    public Order(String product, double price, int quantity) {
        super(product, price, quantity);
    }
    
    public double calculateTotal() {
        return getPrice() * getQuantity();
    }

    public void orderSummary() {
        System.out.println("--- Order Summary ---");
        System.out.println("Product Name   : " + getProduct());
        System.out.println("Unit Price     : " + getPrice());
        System.out.println("Quantity       : " + getQuantity());
        System.out.println("Total Amount   : " + calculateTotal());
    }

}