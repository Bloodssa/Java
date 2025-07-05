package Fourth;

public class Truck extends Vehicle{
    protected String tons;

    // NORMAL CONSTRUCTOR
    public Truck() {}

    public Truck(String plateNumber, String make, String model, int year, int choice, String tons) {
        super(plateNumber,make, model, year, choice);
        this.tons = tons;
    }
    @Override
    public String features() {
        return "Load Capacity: " + tons + " tons";
    }
    
}
