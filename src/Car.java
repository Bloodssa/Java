package First;

public class Car extends Vehicle{
    private String brand;
    private String model;
    private int year;

    //SETTERS WITH THE CONSTRUCTOS
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    // GETTERS
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    public void displayCar() {
        System.out.println("\n--- Car Details ---");
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        fuel();
    }
}


//CLASS FOR VEHICLE

class Vehicle {
    private String fuel;
    
    public void setFuel(String fuel) {
        this.fuel =  fuel;
    }

    public String getFuel() {
        return fuel;
    }

    public void fuel() {
        System.out.println("Fuel Type: " + fuel);
    }
}