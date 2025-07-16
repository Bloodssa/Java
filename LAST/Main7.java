package Last;
import java.util.Scanner;

public class Main7 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        String[] words;

        System.out.println("Enter number of words: ");
        int numOfWords = sc.nextInt();
        sc.nextLine();

        words = new String[numOfWords];

        for(int i = 0; i < words.length; i++) {
            System.out.println("Enter value " + (i + 1) + ": ");
            words[i] = sc.nextLine();
        }

        Reverse s = new Reverse();
        s.reverseOrder(words); 

        System.out.println();

        System.out.println("Words in reverse order:");
        for (String w : words) {
            System.out.println(w);
        }

        sc.close();
    }
}

class Reverse {

    public void reverseOrder(String[] words) {
        int start = 0;
        int end = words.length -1;
                                       
        while(start < end) {
            String temp = words[start];
            words[start] = words[end]; 
            words[end] = temp; 

            start++;
            end--;
        }
    }
}
