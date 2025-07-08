package Fifth;
import java.util.Scanner;

public class Main6 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter type to print:");
        System.out.println("1 - Document\n2 - Image");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("\nEnter image filename: ");
        String file  = sc.nextLine();


        Printable print = null;
        switch(choice) {
            case 1:
            print = new Document(file);
            break;
            case 2: 
            print = new Image(file);
            break;
            default:
            sc.close();
            return;
        }
        print.print();


        sc.close();
    }
}
