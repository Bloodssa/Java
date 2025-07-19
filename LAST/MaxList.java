package First;
import java.util.ArrayList;

public class MaxList {
    public static void main(String [] args){
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(15);
        nums.add(7);
        nums.add(22);
        nums.add(10);
        nums.add(30);
        nums.add(5);

        System.out.println("List: " + nums.toString());

        System.out.println("The maximum element is: " + findMaximum(nums));

    }

    public static int findMaximum(ArrayList<Integer> nums) {

        if(nums == null || nums.isEmpty()) {
            throw new IllegalArgumentException("The ArrayList cannot be null or empty.");
        }

        int max = nums.get(0);

        for (int i = 0; i < nums.size(); i++) {
            if(max < nums.get(i)) {
                max = nums.get(i);
            }
        }
        return max;
    }
}
