package Last;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main9 {
    public static void main (String [] args) {
        Words w = new Words();

        w.iWords();
        System.out.println(w.toString());
    }
}

class Words {
    private List<String> words;
    private Scanner sc = new Scanner(System.in);

    public List<String> iWords() {
        words = new ArrayList<>();

        System.out.println("Enter 4 words: ");
        
        for(int i = 0; i < 4; i++) {
            System.out.println("Word " + (i + 1) + ": ");
            String wordAdd = sc.nextLine();

            words.add(wordAdd);
        }

        System.out.println("Enter word to remove: ");
        String removeWord = sc.nextLine();

            if(words.contains(removeWord)) {
                words.remove(removeWord);
            } else {
            System.out.println("\"" + removeWord + "\" not found.");
        }
        
        return words;
    } 

    @Override
    public String toString() {
        return  "Updated list: "+ words.toString();
    }
}