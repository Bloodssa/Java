package First;
import java.util.Scanner;

public class Main5 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter vehicle brand: ");
        String brand = sc.nextLine();

        System.out.println("Enter model: ");
        String model = sc.nextLine();

        System.out.println("Enter year: ");
        int year = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter fuel type: ");
        String fuel = sc.nextLine();

        Car car = new Car(brand, model, year);
        car.setFuel(fuel);
        car.displayCar();
        
        sc.close();
    }
}
