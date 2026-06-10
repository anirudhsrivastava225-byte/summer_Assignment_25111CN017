package Day_4;
import java.util.* ;
public class fibonacciTerm {
    public static void main( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( " Which Fibonacci term you want? : " ) ;
        int n = input.nextInt () ;
        System.out.println ( " " ) ;
        System.out.println ( " The " + n + "th Fibonacci term is " + fibonacciTerm ( n ) ) ;
    }
    public static int fibonacciTerm ( int a ) {
        List < Integer > series = new ArrayList <> ( Arrays.asList ( 0 , 1 ) ) ;
        if ( a == 0 ) return 0 ;
        if ( a == 1 ) return 1 ;
        if ( a == 2 ) return 1 ;
        for ( int i = 2 ; i < a ; i++ ){
            series.add ( series.get( i - 1 ) + series.get( i -2 ) ) ;
        }
        return ( series.get (a - 1 ) ) ;

    }
}
