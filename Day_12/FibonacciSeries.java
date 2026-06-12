package Day_12 ;

import java.util.Scanner ;

public class FibonacciSeries {
    private int termsHolder ;

    public FibonacciSeries ( int a ) {
        this.termsHolder = a ;
    }

    public String primaryManager () {
        return generateFibonacci ( termsHolder ) ;
    }

    public String generateFibonacci ( int n ) {
        StringBuilder series = new StringBuilder () ;
        int a = 0, b = 1 ;
        for ( int i = 1 ; i <= n ; i++ ) {
            series.append( a ).append( " " ) ;
            int next = a + b ;
            a = b ;
            b = next ;
        }
        return series.toString() ;
    }
}

class FibonacciSeriesRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter number of terms : " ) ;
        int x = input.nextInt() ;
        FibonacciSeries num = new FibonacciSeries ( x ) ;
        System.out.println( "The Fibonacci series is : " + num.primaryManager() ) ;
        input.close() ;
    }
}