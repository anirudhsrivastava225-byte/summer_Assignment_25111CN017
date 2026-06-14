package Day_14;

import java.util.Scanner;

public class LinearSearch {
    private int[] arrayHolder ;
    private int targetHolder ;

    public LinearSearch ( int[] arr , int target ) {
        this.arrayHolder = arr ;
        this.targetHolder = target ;
    }

    public int findIndex () {
        for ( int i = 0 ; i < arrayHolder.length ; i++ ) {
            if ( arrayHolder[i] == targetHolder ) {
                return i ;
            }
        }
        return -1 ;
    }
}

class LinearSearchRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter the size of the array : " ) ;
        int size = input.nextInt () ;
        int[] arr = new int[size] ;

        System.out.println ( "Enter the elements of the array : " ) ;
        for ( int i = 0 ; i < size ; i++ ) {
            arr[i] = input.nextInt () ;
        }

        System.out.print ( "Enter the target element to search : " ) ;
        int target = input.nextInt () ;

        LinearSearch searcher = new LinearSearch ( arr , target ) ;
        int result = searcher.findIndex () ;

        if ( result != -1 ) {
            System.out.println ( "Element found at index : " + result ) ;
        } else {
            System.out.println ( "Element not found in the array." ) ;
        }
        input.close () ;
    }
}
