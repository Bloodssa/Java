package Last;
import java.util.Scanner;
import java.util.InputMismatchException;

public class StudentGrader {
    int grade = -1;

    public int getValidGradeFromUser(){

        while(true) {
            try(Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter student grade: ");
                
                if(!sc.hasNextInt()) {
                    sc.next();
                    throw new InputMismatchException("Invalid input. Please enter a whole number.");
                }
                grade = sc.nextInt();
                if(grade < 0 || grade > 100){
                    throw new InvalidGradeException("Grade must be between 0 and 100.");
                }

                break;
            }catch(InputMismatchException e) {
                System.out.println("Error: " + e.getMessage());
            }catch(InvalidGradeException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        return grade;
    }
} 
