package Day_13 ;

import java.util.Scanner ;

public class EvenOddCounter {
    private int[] arrHolder ;

    public EvenOddCounter ( int[] a ) {
        this.arrHolder = a ;
    }

    public String primaryManager () {
        int evenCount = 0 ;
        int oddCount = 0 ;

        for ( int i = 0 ; i < arrHolder.length ; i++ ) {
            if ( arrHolder[i] % 2 == 0 ) evenCount++ ;
            else oddCount++ ;
        }

        return "Even elements = " + evenCount + ", Odd elements = " + oddCount ;
    }
}

class EvenOddCounterRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter the size of the array : " ) ;
        int n = input.nextInt() ;
        int[] x = new int[n] ;
        System.out.println( "Enter " + n + " elements : " ) ;
        for ( int i = 0 ; i < n ; i++ ) {
            x[i] = input.nextInt() ;
        }
        EvenOddCounter num = new EvenOddCounter ( x ) ;
        System.out.println( num.primaryManager() ) ;
        input.close() ;
    }
}