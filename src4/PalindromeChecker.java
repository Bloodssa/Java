package Fourth;

public class PalindromeChecker {

    private String word;
    private String reversed;

    public PalindromeChecker(String word) {
        this.word = word;
    }

    public String reversed() {

        reversed = "";

        for (int  i = this.word.length() -1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return reversed;
    }

    public String checker() {
        return reversed().trim().toLowerCase().equals(this.word.trim().toLowerCase()) ? 
        "Result: It's a palindrome!" : 
        "Result: Not a palindrome.";
    }   
}
