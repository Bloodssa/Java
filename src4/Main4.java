package Fourth;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many vehicles do you want to register? ");
        int numberOfVehicles = sc.nextInt();

        Vehicle [] vehicles = new Vehicle[numberOfVehicles];
        
        for (int i = 0; i < numberOfVehicles; i++) {
            System.out.println("\nEnter vehicle type (1 - Car, 2 - Motorcycle, 3 - Truck): ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            //FOR THE CAR VEHICLE
            if(choice == 1) {
                System.out.println("Enter Plate Number: ");
                String plateNumber = sc.nextLine();

                System.out.println("Enter Make: ");
                String make = sc.nextLine();

                System.out.println("Enter Model: ");
                String model = sc.nextLine();

                System.out.println("Enter Year: ");
                int year = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter Numbers of Doors: ");
                String doors = sc.nextLine();

                vehicles [i] = new Car(plateNumber, make, model, year, choice, doors);
            }
            // FOR THE MOTORCYCLE
            else if (choice == 2) {
                System.out.println("Enter Plate Number: ");
                String plateNumber = sc.nextLine();

                System.out.println("Enter Make: ");
                String make = sc.nextLine();

                System.out.println("Enter Model: ");
                String model = sc.nextLine();

                System.out.println("Enter Year: ");
                int year = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter Motorcycle Type: ");
                String type = sc.nextLine();

                vehicles [i] = new Motorcycle(plateNumber, make, model, year, choice, type);
            }
            // FOR THE TRUCK
            else if(choice == 3) {
                System.out.println("Enter Plate Number: ");
                String plateNumber = sc.nextLine();

                System.out.println("Enter Make: ");
                String make = sc.nextLine();

                System.out.println("Enter Model: ");
                String model = sc.nextLine();

                System.out.println("Enter Year: ");
                int year = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter Load Capacity (tons): ");
                String tons = sc.nextLine();

                vehicles [i] = new Truck(plateNumber, make, model, year, choice, tons);
            }
            else {
                System.out.println("Invalid choice. Skipping this entry.");
                i--;
                continue;
            }
        }

        System.out.println("===== Vehicle Registration Summary =====");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }

        sc.close();

    }
}
