package Day_11 ;

import java.util.Scanner ;

public class FactorialCalculator {
    private int numHolder ;

    public FactorialCalculator ( int a ) {
        this.numHolder = a ;
    }

    public long primaryManager () {
        return findFactorial ( numHolder ) ;
    }

    public long findFactorial ( int n ) {
        long fact = 1 ;
        for ( int i = 1 ; i <= n ; i++ ) {
            fact *= i ;
        }
        return fact ;
    }
}

class FactorialCalculatorRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter a number : " ) ;
        int x = input.nextInt() ;
        FactorialCalculator num = new FactorialCalculator ( x ) ;
        System.out.println( "The factorial of " + x + " is : " + num.primaryManager() ) ;
        input.close() ;
    }
}