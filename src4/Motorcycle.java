package Fourth;

// SUBCLASS
public class Motorcycle extends Vehicle{
    protected String type;
    // NORMAL CONSTRUCTOR
    public Motorcycle() {}

    public Motorcycle(String plateNumber, String make, String model, int year, int choice, String type) {
        super(plateNumber,make, model, year, choice);
        this.type = type;
    }
    @Override
    public String features() {
        return "Type: " + type;
    }
}
