package Fourth;

// SUBCLASS
public class Car extends Vehicle{
    protected String doors;
    // NORMAL CONSTRUCTOR
    public Car() {}

    public Car(String plateNumber, String make, String model, int year, int choice, String doors) {
        super(plateNumber,make, model, year, choice);
        this.doors = doors;
    }
    @Override
    public String features() {
        return "Doors: " + doors;
    }
    
}
