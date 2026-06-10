package Day_4 ;
import java.util.* ;
public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( " Up-to which term you want to make this Fibonacci series : " ) ;
        int n = input.nextInt () ;
        System.out.println( " " ) ;
        System.out.println( "The Fibonacci series is : " ) ;
        System.out.println( fibonacciGenerator( n ) ) ;
    }
    public static List < Integer > fibonacciGenerator( int a ) {
        List < Integer > series = new ArrayList <> () ;
        series.add ( 0 )  ;
        if ( a == 1 ) return series ;
        series.add ( 1 ) ;
        if ( a == 2 ) return series ;
        int m = 0 ;
        for ( int i = 2 ; i < a ; i++ ){
            series.add ( series.get ( i - 1 ) + series.get ( i - 2 ) ) ;
        }
        return series ;
    }
}
