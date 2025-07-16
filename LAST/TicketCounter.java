package Last;

public class TicketCounter {
    private int numberOfSeat;

    public TicketCounter(int numOfSeat) {
        this.numberOfSeat = numOfSeat;
    }

    public synchronized void bookTickets(String user, int seatBook) {
        System.out.println(user + " trying to book " + seatBook + " seats...");
        if(numberOfSeat >= seatBook) {
            numberOfSeat -= seatBook;
            System.out.println(user + " successfully booked " + seatBook + ". Seats left: " + numberOfSeat);
        }
        else {
            System.out.println(user + " failed to book. Not enough seats. Seats left: " + numberOfSeat);
        }
    }
}

class UserBooking implements Runnable {
    TicketCounter ticket;
    private String user;
    private int seatBook;

    public UserBooking(TicketCounter ticket, String user, int seatBook) {
        this.user = user;
        this.ticket = ticket;
        this.seatBook = seatBook;
    }

    @Override
    public void run() {
        ticket.bookTickets(user, seatBook);
    }
}