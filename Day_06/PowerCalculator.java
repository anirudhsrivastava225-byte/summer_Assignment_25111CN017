package Day_6 ;

import java.util.Scanner ;

public class PowerCalculator {
    private double baseHolder ;
    private int expHolder ;

    public PowerCalculator ( double a, int b ) {
        this.baseHolder = a ;
        this.expHolder = b ;
    }

    public double primaryManager () {
        double result = 1.0 ;
        double x = baseHolder ;
        long n = expHolder ;

        if ( n < 0 ) {
            n = -n ;
            x = 1.0 / x ;
        }

        while( n > 0 ) {
            if ( n % 2 == 1 ) result *= x ;
            x *= x ;
            n /= 2 ;
        }

        return result ;
    }
}

class PowerCalculatorRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter base x : " ) ;
        double x = input.nextDouble() ;
        System.out.print( "Enter exponent n : " ) ;
        int n = input.nextInt() ;
        PowerCalculator num = new PowerCalculator ( x, n ) ;
        System.out.println( x + " raised to the power of " + n + " is " + num.primaryManager() ) ;
        input.close() ;
    }
}