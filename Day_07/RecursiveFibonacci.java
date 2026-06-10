package Day_7 ;

import java.util.Scanner ;

public class RecursiveFibonacci {
    private int numHolder ;

    public RecursiveFibonacci ( int a ) {
        this.numHolder = a ;
    }

    public int primaryManager () {
        return calculateFibonacci ( numHolder ) ;
    }

    public int calculateFibonacci ( int n ) {
        if ( n <= 1 ) return n ;
        return calculateFibonacci ( n - 1 ) + calculateFibonacci ( n - 2 ) ;
    }
}

class RecursiveFibonacciRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter a number : " ) ;
        int x = input.nextInt() ;
        RecursiveFibonacci num = new RecursiveFibonacci ( x ) ;
        System.out.println( "The Fibonacci number at position " + x + " is " + num.primaryManager() ) ;
        input.close() ;
    }
}