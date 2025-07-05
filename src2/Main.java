package Second;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your gender: ");
        String gender = sc.nextLine();
        System.out.println("Enter your address: ");
        String address = sc.nextLine();



        Person myPerson = new Person();

        myPerson.myPerson(name, age, gender, address);
        myPerson.Info();

        sc.close();
    }
}
