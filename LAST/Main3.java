package Last;
import java.util.Scanner;
import java.util.InputMismatchException;

class Countdown {
    Scanner sc = new Scanner(System.in);

    public int countValue() {
        int countValue = 0;
        
        while(true) {
            try{
                System.out.println("Timer 1 countdown from: ");
                if(!sc.hasNextInt()) {
                    sc.nextLine();
                    throw new InputMismatchException("You must input a number");
                }
                countValue = sc.nextInt();
                if (countValue < 0) {
                    throw new InputMismatchException("Countdown must be a positive number.");
                }

                break;

            }catch(InputMismatchException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return countValue;
    }

}

public class Main3 {
    public static void main(String []args) {            
        Countdown c = new Countdown();
        int count1 = c.countValue();
        int count2 = c.countValue();

        Runnable timer1 = () -> {
            for(int i = count1; i >= 0; i--) {
                System.out.println("[Timer 1]" + i);
                try {
                    Thread.sleep(1000);
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("[Timer 1] DONE");
        };
        Runnable timer2 = () -> {
            for(int i = count2; i >= 0; i--) {
                System.out.println("[Timer 2]" + i);
                try {
                    Thread.sleep(1000);
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("[Timer 2] DONE");
        };

        Thread t1 = new Thread(timer1);
        Thread t2 = new Thread(timer2);

        t1.start();
        t2.start();

    }
}
