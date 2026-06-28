package Day_28 ;

import java.util.Scanner ;

public class TicketBookingSystem {
    private String movieNameHolder ;
    private int ticketCountHolder ;
    private double pricePerTicketHolder ;

    public TicketBookingSystem ( String movie , int count , double price ) {
        this.movieNameHolder = movie ;
        this.ticketCountHolder = count ;
        this.pricePerTicketHolder = price ;
    }

    public double calculateTotal () {
        return ticketCountHolder * pricePerTicketHolder ;
    }

    public void displayBooking () {
        System.out.println ( "--- Ticket Booking Details ---" ) ;
        System.out.println ( "Movie : " + movieNameHolder ) ;
        System.out.println ( "Tickets : " + ticketCountHolder ) ;
        System.out.println ( "Total Cost : " + calculateTotal () ) ;
    }
}

class TicketBookingSystemRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;

        System.out.print ( "Enter Movie Name : " ) ;
        String movie = input.nextLine () ;

        System.out.print ( "Enter Number of Tickets : " ) ;
        int count = input.nextInt () ;

        System.out.print ( "Enter Price per Ticket : " ) ;
        double price = input.nextDouble () ;

        TicketBookingSystem booking = new TicketBookingSystem ( movie , count , price ) ;
        booking.displayBooking () ;

        input.close () ;
    }
}
