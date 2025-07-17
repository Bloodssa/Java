package Last;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main8 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        System.out.println("How many numbers? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number: " + (i + 1) + ": ");
            int number = sc.nextInt();

            nums.add(number);
        }

        Numbers N = new Numbers(nums);
        N.removeOddNumbers();

        System.out.println(N.toString());

        sc.close();
    }
}

class Numbers {
    private List<Integer> evenNumbers;

    public Numbers(List<Integer> nums) {
        this.evenNumbers = nums;
    }

    public List<Integer> removeOddNumbers() {

        for (int i = evenNumbers.size() - 1; i >= 0; i--) {
            if(evenNumbers.get(i) % 2 != 0) {
                evenNumbers.remove(i);
            }   
        }

        return evenNumbers;
    }

    @Override
    public String toString() {
        return evenNumbers.toString();
    }

}