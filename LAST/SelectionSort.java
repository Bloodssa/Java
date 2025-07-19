package Last;
import java.util.ArrayList;

public class SelectionSort {
    public static void selectionSort(ArrayList<Integer> scores) {
        for(int i = 0; i < scores.size() - 1; i++) {
            int min = i;
            for(int j = i + 1; j < scores.size(); j++) {
                if(scores.get(min) > scores.get(j)) {
                    min = j;
                }
            }
            int temp = scores.get(i);
            scores.set(i, scores.get(min));
            scores.set(min, temp);
        }
    }
}
