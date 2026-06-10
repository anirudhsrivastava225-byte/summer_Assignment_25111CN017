package Day_07;

import java.util.Scanner ;

public class RecursiveReverseNumber {
    private int numHolder ;

    public RecursiveReverseNumber ( int a ) {
        this.numHolder = a ;
    }

    public int primaryManager () {
        int temp = Math.abs( numHolder ) ;
        int reversed = calculateReverse ( temp, 0 ) ;
        if ( numHolder < 0 ) return -reversed ;
        return reversed ;
    }

    public int calculateReverse ( int n, int rev ) {
        if ( n == 0 ) return rev ;
        return calculateReverse ( n / 10, rev * 10 + ( n % 10 ) ) ;
    }
}

class RecursiveReverseNumberRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter a number : " ) ;
        int x = input.nextInt() ;
        RecursiveReverseNumber num = new RecursiveReverseNumber ( x ) ;
        System.out.println( "The reverse of " + x + " is " + num.primaryManager() ) ;
        input.close() ;
    }
}