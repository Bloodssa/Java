package Last;

public class Main2 {
    public static void main(String []args) {
        StudentGrader student = new StudentGrader();
        int validGrade = student.getValidGradeFromUser();
        System.out.println("Valid grade entered: " + validGrade);
    }
}
