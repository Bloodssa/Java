package Third;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calcArea() {
        return Math.PI * radius *radius;
    }
    public double calcCircumference() {
        return 2 * Math.PI * radius;
    }
    public void displayResult() {
        System.out.println("\nRaduis: " + radius);
        System.out.println("Area: " + calcArea());
        System.out.println("Circumference: " + calcCircumference());    
    }
}
