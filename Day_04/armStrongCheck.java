package Day_04;
import java.util.* ;
public class armStrongCheck {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( " Enter a number to check if it is Armstrong: " ) ;
        int a = input.nextInt () ;
        System.out.println( " " ) ;
        System.out.println( checker ( a ) );
    }
    public static String checker ( int x ) {
        int copy = x ;
        int count = 0 ;
        int num = 0 ;
        while ( x > 0 ) {
            x = x / 10 ;
            count ++ ;
        }
        x = copy ;
        while ( x > 0 ) {
            int n = x % 10 ;
            num += (int) Math.pow ( n , count );
            x = x / 10 ;
        }
        if ( num == copy ) return ( " The number " + copy + " is Armstrong number. " ) ;
        else return ( " The number " + copy + " is not Armstrong number. " ) ;
    }
}
