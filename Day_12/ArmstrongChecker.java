package Day_12 ;

import java.util.Scanner ;

public class ArmstrongChecker {
    private int numHolder ;

    public ArmstrongChecker ( int a ) {
        this.numHolder = a ;
    }

    public boolean primaryManager () {
        return isArmstrong ( numHolder ) ;
    }

    public boolean isArmstrong ( int n ) {
        int temp = n ;
        int digits = 0 ;
        while ( temp > 0 ) {
            digits++ ;
            temp /= 10 ;
        }
        temp = n ;
        int sum = 0 ;
        while ( temp > 0 ) {
            int rem = temp % 10 ;
            sum += Math.pow( rem, digits ) ;
            temp /= 10 ;
        }
        return n == sum ;
    }
}

class ArmstrongCheckerRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter a number : " ) ;
        int x = input.nextInt() ;
        ArmstrongChecker num = new ArmstrongChecker ( x ) ;
        if ( num.primaryManager() ) {
            System.out.println( x + " is an Armstrong number." ) ;
        } else {
            System.out.println( x + " is not an Armstrong number." ) ;
        }
        input.close() ;
    }
}