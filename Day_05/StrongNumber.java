package Day_05;
import java.util.Scanner ;
public class StrongNumber {
    private final int number ;
    public StrongNumber ( int n ) {
        this.number = n ;
    }
    public boolean strongAnalyzer () {
        if (number <= 0) return false;
        int copy = number ;
        int sum = 0 ;
        while ( copy > 0 ) {
            int fact = 1 ;
            int rem = copy % 10 ;
            for ( int i = 1 ; i <= rem ; i++ ) {
                fact *= i ;
            }
            sum += fact ;
            copy /= 10 ;
        }
        return ( sum == number ) ;
    }
}
class StrongNumberRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter a number to check if it's strong number: " ) ;
        int n = input.nextInt() ;
        System.out.println() ;
        StrongNumber test = new StrongNumber ( n ) ;
        if ( test.strongAnalyzer ()) System.out.println( "The number " + n + " is a strong number" ) ;
        else System.out.println( "The number " + n + " is not a strong number" ) ;
        input.close() ;
    }
}
