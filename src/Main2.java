package First;
import java.util.Scanner;

public class Main2 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name: ");
        String name = sc.nextLine();

        System.out.println("Enter student ID: ");
        String id = sc.nextLine();

        System.out.println("Enter course: ");
        String course = sc.nextLine();

        Information info = new Information();

        info.setter(name, id, course);
        info.display();

        sc.close();
    }
}   
