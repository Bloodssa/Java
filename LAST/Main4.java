package Last;

public class Main4 {
    public static void main(String []args) { 
        TicketCounter t = new TicketCounter(5);

        Thread t1 = new Thread(new UserBooking(t, "Alice", 2));
        Thread t2 = new Thread(new UserBooking(t, "Bob", 3));
        Thread t3 = new Thread(new UserBooking(t, "Charlie", 2));

        t1.start();
        t2.start();
        t3.start();

        try{
            t1.join();
            t2.join();
            t3.join();
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
