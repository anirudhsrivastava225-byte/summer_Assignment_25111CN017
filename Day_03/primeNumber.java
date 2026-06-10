package Day_3;
import java.util.*;
public class primeNumber {
    public static void main ( String [] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.println ( " Enter a number: " ) ;
        int notPrimeSignal = 0 ;
        int n = input.nextInt () ;
        for ( int i = 2 ; i < n ; i++ ) {
            if ( n % i == 0 ){
                notPrimeSignal ++ ;
            }
        }
        if ( n == 1  ) {
            System.out.println ( "The number 1 is not prime number " ) ;
            System.exit ( 0 ) ;
        }
        if ( notPrimeSignal == 0 ) System.out.println ( " The number " + n + " is prime number. " ) ;
        else System.out.println ( " The number " + n + " is not prime number. " ) ;
   }
}
