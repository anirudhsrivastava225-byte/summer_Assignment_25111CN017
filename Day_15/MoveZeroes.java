package Day_15 ;

import java.util.Scanner ;

public class MoveZeroes {
    private int[] arrayHolder ;

    public MoveZeroes ( int[] arr ) {
        this.arrayHolder = arr ;
    }

    public void move () {
        int count = 0 ;
        int n = arrayHolder.length ;

        for ( int i = 0 ; i < n ; i++ ) {
            if ( arrayHolder[i] != 0 ) {
                int temp = arrayHolder[count] ;
                arrayHolder[count] = arrayHolder[i] ;
                arrayHolder[i] = temp ;
                count++ ;
            }
        }
    }

    public void printArray () {
        for ( int i = 0 ; i < arrayHolder.length ; i++ ) {
            System.out.print ( arrayHolder[i] + " " ) ;
        }
        System.out.println () ;
    }
}

class MoveZeroesRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter the size of the array : " ) ;
        int size = input.nextInt () ;
        int[] arr = new int[size] ;

        System.out.println ( "Enter the elements of the array : " ) ;
        for ( int i = 0 ; i < size ; i++ ) {
            arr[i] = input.nextInt () ;
        }

        MoveZeroes mover = new MoveZeroes ( arr ) ;
        mover.move () ;

        System.out.print ( "Array after moving zeroes to end : " ) ;
        mover.printArray () ;

        input.close () ;
    }
}
