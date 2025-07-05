package Fourth;
//SUPER CLASS
public abstract class Vehicle {
    private String plateNumber;
    private String make;
    private String model;
    private int year;

    // TYPE OF VEHICLES
    String [] typeOfVehicles = {"Car", "Motorcylce", "Truck"};

    int choice;

    // NORMAL CONSTRUCTOR
    public Vehicle() {}

    public Vehicle(String plateNumber, String make, String model, int year, int choice) {
        this.plateNumber = plateNumber;
        this.make = make;
        this.model = model;
        this.year = year;
        this.choice = choice;
    }

    // GETTERS
    public String getPlateNumber() {
        return plateNumber;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    public abstract String features();

    public void displayInfo() {
        System.out.println("\n[" + typeOfVehicles[(choice - 1)] + "]");
        System.out.println("Plate Number: " + getPlateNumber());
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println(features());
        System.out.println("--------------------------");
    }

}
