package Fourth;
import java.util.Scanner;

public class Main2 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word or phrase: ");
        String word = sc.nextLine();

        PalindromeChecker pc = new PalindromeChecker(word);

        // System.out.println(pc.reversed());

        System.out.println("\n--- Palindrome Checker ---");
        System.out.println("Input: " + word);
        System.out.println(pc.checker());

        sc.close();
    }
}
