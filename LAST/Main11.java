package Last;
import java.util.ArrayList;

    public class Main11 {
        public static void main(String[] args) {

            ArrayList<Integer> scores = new ArrayList<>();

            scores.add(50);
            scores.add(20);
            scores.add(80);
            scores.add(10);
            scores.add(40);

            System.out.println("Original list: " + scores.toString());

            SelectionSort.selectionSort(scores);

            System.out.println("Sorted list: " + scores.toString());

        }

    }   
