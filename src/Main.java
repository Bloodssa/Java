package First;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner reader = new Scanner(System.in);

        // Student student = new Student();

        System.out.println("Enter student name: ");
        String name = reader.nextLine();
        String studentName = Student.studentName(name);

        System.out.println("Enter student ID: ");
        String id = reader.nextLine();
        String studentId = Student.studentId(id);;

        System.out.println("Enter student course: ");
        String course = reader.nextLine();
        String studentCourse = Student.studentCourse(course);

        String grades = Student.studentGrades();

        // records
        System.out.println("\n\n--- Student Record ---");
        System.out.println("Name: "+ studentName);
        System.out.println("Student ID: "+ studentId);
        System.out.println("Student Course: " + studentCourse);
        System.out.println("Grades: " + grades);

        reader.close();
    }
}