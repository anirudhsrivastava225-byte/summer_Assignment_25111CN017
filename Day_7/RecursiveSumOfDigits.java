package Day_7 ;

import java.util.Scanner ;

public class RecursiveSumOfDigits {
    private int numHolder ;

    public RecursiveSumOfDigits ( int a ) {
        this.numHolder = a ;
    }

    public int primaryManager () {
        int temp = Math.abs( numHolder ) ;
        return calculateSum ( temp ) ;
    }

    public int calculateSum ( int n ) {
        if ( n == 0 ) return 0 ;
        return ( n % 10 ) + calculateSum ( n / 10 ) ;
    }
}

class RecursiveSumOfDigitsRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter a number : " ) ;
        int x = input.nextInt() ;
        RecursiveSumOfDigits num = new RecursiveSumOfDigits ( x ) ;
        System.out.println( "The sum of digits of " + x + " is " + num.primaryManager() ) ;
        input.close() ;
    }
}