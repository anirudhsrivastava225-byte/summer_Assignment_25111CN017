package Day_11 ;

import java.util.Scanner ;

public class PrimeChecker {
    private int numHolder ;

    public PrimeChecker ( int a ) {
        this.numHolder = a ;
    }

    public boolean primaryManager () {
        return checkPrime ( numHolder ) ;
    }

    public boolean checkPrime ( int n ) {
        if ( n <= 1 ) return false ;
        for ( int i = 2 ; i <= Math.sqrt( n ) ; i++ ) {
            if ( n % i == 0 ) return false ;
        }
        return true ;
    }
}

class PrimeCheckerRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter a number : " ) ;
        int x = input.nextInt() ;
        PrimeChecker num = new PrimeChecker ( x ) ;
        if ( num.primaryManager() ) {
            System.out.println( x + " is a prime number." ) ;
        } else {
            System.out.println( x + " is not a prime number." ) ;
        }
        input.close() ;
    }
}