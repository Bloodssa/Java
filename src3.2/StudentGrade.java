package Third;
import java.util.Scanner;

public class StudentGrade {
    private String name;
    public StudentGrade(String name, int[] grades) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public static StudentGrade getStudentGrades() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.println("Enter 3 grades: ");
        int[] grades = new int[3];
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Grade " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
        }

        StudentGrade student = new StudentGrade(name, grades);
        System.out.println("\nStudent Grade Summary");
        System.out.println("Name: " + student.getName());

        System.out.print("Grades: ");
        
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) {
                System.out.print(", ");
            }
        }

        double average, sum = 0;

        for (int gr: grades) {
            sum += gr;
        }
        average = sum / grades.length;
        System.out.println("\nAverage: "+average);

        if (average >= 75) {
            System.out.println("Remark: Passed");
        } 
        else {
           System.out.println("Remark: Failed"); 
        }

        sc.close();
        return new StudentGrade(name, grades);
    }
}
