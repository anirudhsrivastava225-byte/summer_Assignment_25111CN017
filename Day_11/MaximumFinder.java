package Day_11 ;

import java.util.Scanner ;

public class MaximumFinder {
    private int num1 ;
    private int num2 ;

    public MaximumFinder ( int a, int b ) {
        this.num1 = a ;
        this.num2 = b ;
    }

    public int primaryManager () {
        return findMaximum ( num1, num2 ) ;
    }

    public int findMaximum ( int a, int b ) {
        if ( a > b ) return a ;
        return b ;
    }
}

class MaximumFinderRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter first number : " ) ;
        int x = input.nextInt() ;
        System.out.print( "Enter second number : " ) ;
        int y = input.nextInt() ;
        MaximumFinder num = new MaximumFinder ( x, y ) ;
        System.out.println( "The maximum is : " + num.primaryManager() ) ;
        input.close() ;
    }
}