package Last;

import java.util.List;

public class ReverseList {
    private List<Integer> list;
    private int [] nums;

    public ReverseList(List<Integer> list, int[] nums) {
        this.list = list;
        this.nums = nums;
    }

    // reverse list with for loop
    public List<Integer> reverseListWithForLoop() {

        for(int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            int n = list.size() - i - 1;
            list.set(i, list.get(n));
            list.set(n, temp);

            n--;
        }

        return list;
    }

    // reverse list with while loop
    public List<Integer> reverseListWithWhileLoop() {

        int start = 0;
        int end = list.size() - 1;

        while(start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            start++;
            end--;  
        }

        return list;
    }

    public int[] arrayReverse() {

        int start = 0;
        int end = nums.length - 1;
        
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }

        return nums;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
