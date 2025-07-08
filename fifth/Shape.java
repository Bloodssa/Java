package Fifth;

public abstract class Shape {

    public abstract double calculateArea();

    public abstract void resultCalculation();
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double radius() {
        return radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public void resultCalculation() {
        System.out.println("Shape: Circle");
        System.out.println("Radius: " + radius());
        System.out.println("Area: " + calculateArea());
    }

}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double width() {
        return width;
    }   
    public double height() {
        return height;
    }                                            

    @Override
    public double calculateArea() {
        return width * height;
    }
    @Override
    public void resultCalculation() {
        System.out.println("Shape: Rectangle");
        System.out.println("Width: " + width());
        System.out.println("Width: " + height());
        System.out.println("Width: " + calculateArea());

    }

}