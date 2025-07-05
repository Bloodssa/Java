package Second;
import java.util.*;
    
public class Temperature {
    private Scanner sc;
    private int choice;
    private double value;


    public void inputHandler(Scanner sc) {
        this.sc = sc;
    }
    public void tempChoice() {
        System.out.println("--- Temperature Converter ---");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        System.out.println("\nChoose conversion type (1 or 2): ");
        choice = sc.nextInt();
    }

    public void converter() {
        if (choice == 1) {
            System.out.println("Enter temperature in Celsius: ");
            value = sc.nextDouble();
            value = (value * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + value + "°F");
        }
        else if (choice == 2) {
            System.out.println("Enter temperature in Fahrenheit: ");
            value = sc.nextDouble();
            value = (value - 32) * 5 / 9;
            System.out.println("Temperature in Celsuis: " + value + "°");
        }
        else {
            System.out.println("Enter temperature in Fahrenheit: ");
            value = sc.nextDouble();
            value = (value - 32) * 5 / 9;
            System.out.println("Temperature in Celsuis: " + value + "°");
        }
    }
}