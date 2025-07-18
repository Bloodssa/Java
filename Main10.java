package Last;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Main10 {
    public static void main(String []args) {
        List<Integer> list = new ArrayList<>();
        int [] nums= {1, 2, 3, 4, 5, 6};

        list.add(50);
        list.add(20);
        list.add(80);
        list.add(10);
        list.add(40);

        System.out.println("Original List: " + list);
        
        ReverseList rl =  new ReverseList(list, nums);

        rl.reverseListWithForLoop();
        
        System.out.println("\nReversed List with for loop: " + list.toString());

        list.clear();

        list.add(50);
        list.add(20);
        list.add(80);
        list.add(10);
        list.add(40);

        rl.reverseListWithWhileLoop();

        System.out.println("Reversed List with While loop: " + list.toString());


        System.out.println("\nOriginal Array " + Arrays.toString(nums));
        rl.arrayReverse();
        System.out.println("Reverse Array with While Loop " + Arrays.toString(nums));
        

    }
}