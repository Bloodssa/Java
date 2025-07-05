package Second;
import java.util.*;

public class Main3 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        BankAccount bk = new BankAccount();
        bk.inputHandler(sc);

        bk.userName();
        bk.deposit();
        bk.withdraw();
        bk.displayBlance();

        sc.close(); 
    }
}
