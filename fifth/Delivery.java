package Fifth;

public enum Delivery {
    STANDARD(10.00), 
    EXPRESS(20.00), 
    SAMEDAY(200.00);

    private double rate;

    private Delivery(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
}

interface DeliveryRate {
    double calculateRate();
    void totalOutput();
}

class Rate implements DeliveryRate {

    private double rate;
    private double calculateRate;
    private double kilometers;
    private String method;

    public Rate(String method, double rate, double kilometers) {
        this.method = method;
        this.rate = rate;
        this.kilometers = kilometers;
    }

    public double calculateRate() {
        calculateRate = rate * kilometers;
        return calculateRate;
    }

    public double getRate() {
        return rate;
    }
    public double getKilometers() {
        return kilometers;
    }
    public String getMethod() {
        return method;
    }

    public void totalOutput() {
        System.out.println("\nDelivery Method: " + getMethod());
        System.out.println("Distance: " + getKilometers() + " km");
        System.out.println("Base Rate: " + getRate() + "/km");
        System.out.println("Total Fee: " + calculateRate());
    }

    // FOR THE SAMEDAY
    public void totalOutputSameDay() {
        System.out.println("\nDelivery Method: " + getMethod());
        System.out.println("Distance: " + getKilometers() + " km");
        System.out.println("Flat Rate: " + getRate() + "/km");
        System.out.println("Total Fee: " + getRate());
    }
}