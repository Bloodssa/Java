package Fifth;
import java.util.Scanner;

public class Main3 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Device Name: ");
        String device = sc.nextLine();

        System.out.println("Enter Battery Level (%): ");
        int batteryLevel = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Battery Health (Excellent / Good / Weak / Charging...): ");
        String batteryHealth = sc.nextLine();

        Smartphone smartPhone = new Smartphone();
        Smartphone.Battery battery = smartPhone.new Battery(batteryLevel, batteryHealth, device);

        battery.showStatus();

        sc.close();

    }
}