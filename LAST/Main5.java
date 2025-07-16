package Last;
import java.util.Scanner;

public class Main5 {
    public static void main(String []args) {
        Grades g = new Grades();
        g.calculateArray();
        g.outputOfGrades();
    }
}

class Grades {
    private Scanner sc;
    private int gradeArrays[];
    private int low;
    private int high;
    private double average;
    private double sum = 0;

    public void calculateArray() {
        sc = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int numOfStudents = sc.nextInt();

        gradeArrays = new int[numOfStudents];

        for(int i = 0; i < gradeArrays.length; i++) {
            System.out.println("Enter grade for student " + (i + 1) + ": ");
            gradeArrays[i] = sc.nextInt();
        }

        high = gradeArrays[0];
        low = gradeArrays[0];

        for(int g : gradeArrays) {
            sum += g;
        }
        average = sum / gradeArrays.length;

        for (int i = 0; i < gradeArrays.length; i++) {
            if(low > gradeArrays[i]) {
                low = gradeArrays[i];
            }
        }

        for (int i = 0; i < gradeArrays.length; i++) {
            if(high < gradeArrays[i]) {
                high = gradeArrays[i];
            }
        }
    }

    public void outputOfGrades() {
        System.out.println("Highest grade: " + high);
        System.out.println("Lowest grade: " + low);
        System.out.println("Average grade: " + average);
    }

}