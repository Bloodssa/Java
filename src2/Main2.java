package Second;
import java.util.Scanner;

public class Main2 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        Temperature temp = new Temperature();
        temp.inputHandler(sc);

        temp.tempChoice();
        temp.converter();

        sc.close();
    }
}
