package Day_5;
import java.util.Scanner ;
public class PerfectNumber {
    private final int inventory ;
    public PerfectNumber ( int number ) {
        this.inventory = number ;
    }
    boolean perfectAnalyzer() {
        int num = inventory ;
        int sum = 1 ;
        for ( int i = 2 ; i <=  ( num / 2 ) ; i++ ) {
            if ( num % i == 0 ) sum += i ;
        }
        return ( sum == num ) ;
    }
}
class PerfectNumberRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter a number to check if it is prefect: ") ;
        int n = input.nextInt() ;
        PerfectNumber test = new PerfectNumber( n ) ;
        System.out.println();
        if ( test.perfectAnalyzer () ) System.out.println ( "The number " + n + " is a perfect number " ) ;
        else System.out.println( "The number " + n + " is not a perfect number " ) ;
        input.close() ;
    }
}
