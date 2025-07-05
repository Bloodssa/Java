package Fourth;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

            int [][][] nums = {
                {{1,2,3},{1,2,3}},
                {{1,2,3},{1,2,3},{1,2,3,5,6,7,9,0}}
            };  

            for (int [][]n : nums) {
                for(int []s : n) {
                    for(int a : s) {
                        System.out.print(a + " ");
                    }
                }
                System.out.println();
            }

        sc.close();

    }
}
