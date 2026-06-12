package Day_12 ;

import java.util.Scanner ;

public class PerfectNumberChecker {
    private int numHolder ;

    public PerfectNumberChecker ( int a ) {
        this.numHolder = a ;
    }

    public boolean primaryManager () {
        return checkPerfect ( numHolder ) ;
    }

    public boolean checkPerfect ( int n ) {
        if ( n <= 1 ) return false ;
        int sum = 0 ;
        for ( int i = 1 ; i <= n / 2 ; i++ ) {
            if ( n % i == 0 ) sum += i ;
        }
        return sum == n ;
    }
}

class PerfectNumberCheckerRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter a number : " ) ;
        int x = input.nextInt() ;
        PerfectNumberChecker num = new PerfectNumberChecker ( x ) ;
        if ( num.primaryManager() ) {
            System.out.println( x + " is a perfect number." ) ;
        } else {
            System.out.println( x + " is not a perfect number." ) ;
        }
        input.close() ;
    }
}