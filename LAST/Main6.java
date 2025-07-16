package Last;
import java.util.Scanner;

public class Main6 {
    public static void main(String []args ) {
        Solution s = new Solution();

        s.inputNums();
        System.out.println(s.hasDuplicate());
    }
}

class Solution {
    private Scanner sc;
    private int[] nums;

    public void inputNums() {
        sc = new Scanner(System.in);

        System.out.println("Enter number of values: ");
        int numOfValues = sc.nextInt();

        nums = new int[numOfValues];

        for(int i = 0; i < nums.length; i++) {
            System.out.println("Enter value " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }
        sc.close();
    }

    public String hasDuplicate() {
        int duplicate;
        for (int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    duplicate = nums[i];
                    return "Duplicate value found: " + duplicate;
                }
            }
        }
        return "All values are unique.";
    }
}