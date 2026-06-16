package Day_16 ;

import java.util.Scanner ;

public class MissingNumber {
    private int[] arrayHolder ;
    private int nHolder ;

    public MissingNumber ( int[] arr , int n ) {
        this.arrayHolder = arr ;
        this.nHolder = n ;
    }

    public int findMissing () {
        int expectedSum = nHolder * ( nHolder + 1 ) / 2 ;
        int actualSum = 0 ;

        for ( int i = 0 ; i < arrayHolder.length ; i++ ) {
            actualSum += arrayHolder[i] ;
        }

        return expectedSum - actualSum ;
    }
}

class MissingNumberRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter the value of N (range 1 to N) : " ) ;
        int n = input.nextInt () ;
        
        int[] arr = new int[n - 1] ;
        System.out.println ( "Enter " + ( n - 1 ) + " elements : " ) ;
        for ( int i = 0 ; i < n - 1 ; i++ ) {
            arr[i] = input.nextInt () ;
        }

        MissingNumber solver = new MissingNumber ( arr , n ) ;
        System.out.println ( "The missing number is : " + solver.findMissing () ) ;
        
        input.close () ;
    }
}
