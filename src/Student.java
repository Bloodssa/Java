package First;
import java.util.Scanner;

public class Student {
    
    public static String studentName(String Name) {
        String name = Name;
        return name;
    }
    public static String studentId(String id) {
        String Id = id;
        return Id;
    }
    public static String studentCourse(String course) {
        String Course = course;
        return Course;
    }

    public static String studentGrades() {
        Scanner reader = new Scanner(System.in);

        final int size = 5;

        int [] grades = new int[size];
        System.out.println("\nEnter 5 grades: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Grade " + (i + 1) + ": ");
            grades[i] = reader.nextInt();
        }

        StringBuilder gradeOfStudent = new StringBuilder();
        double average, sum = 0;
        for (int gr: grades) {
            gradeOfStudent.append(gr).append(" ");
            sum += gr;

        }
        average = sum / size;

        String remark;

        if(average >= 75) {
            remark = "Passed";
        }
        else {
            remark = "Failed";
        }

        reader.close();
        return gradeOfStudent.toString().trim() + "\nAverage: " + average + "\nRemark: " + remark;
    }
}