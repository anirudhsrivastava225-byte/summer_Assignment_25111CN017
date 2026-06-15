package Day_15 ;

import java.util.Scanner ;

public class RotateArrayRight {
    private int[] arrayHolder ;
    private int rotationHolder ;

    public RotateArrayRight ( int[] arr , int k ) {
        this.arrayHolder = arr ;
        this.rotationHolder = k ;
    }

    public void rotate () {
        int n = arrayHolder.length ;
        if ( n == 0 ) return ;
        rotationHolder %= n ;

        for ( int i = 0 ; i < rotationHolder ; i++ ) {
            int last = arrayHolder[n - 1] ;
            for ( int j = n - 1 ; j > 0 ; j-- ) {
                arrayHolder[j] = arrayHolder[j - 1] ;
            }
            arrayHolder[0] = last ;
        }
    }

    public void printArray () {
        for ( int i = 0 ; i < arrayHolder.length ; i++ ) {
            System.out.print ( arrayHolder[i] + " " ) ;
        }
        System.out.println () ;
    }
}

class RotateArrayRightRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter the size of the array : " ) ;
        int size = input.nextInt () ;
        int[] arr = new int[size] ;

        System.out.println ( "Enter the elements of the array : " ) ;
        for ( int i = 0 ; i < size ; i++ ) {
            arr[i] = input.nextInt () ;
        }

        System.out.print ( "Enter number of positions to rotate right : " ) ;
        int k = input.nextInt () ;

        RotateArrayRight rotator = new RotateArrayRight ( arr , k ) ;
        rotator.rotate () ;

        System.out.print ( "Array after right rotation : " ) ;
        rotator.printArray () ;

        input.close () ;
    }
}
