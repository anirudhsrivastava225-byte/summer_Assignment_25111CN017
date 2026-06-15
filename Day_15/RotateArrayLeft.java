package Day_15 ;

import java.util.Scanner ;

public class RotateArrayLeft {
    private int[] arrayHolder ;
    private int rotationHolder ;

    public RotateArrayLeft ( int[] arr , int k ) {
        this.arrayHolder = arr ;
        this.rotationHolder = k ;
    }

    public void rotate () {
        int n = arrayHolder.length ;
        if ( n == 0 ) return ;
        rotationHolder %= n ;
        
        for ( int i = 0 ; i < rotationHolder ; i++ ) {
            int first = arrayHolder[0] ;
            for ( int j = 0 ; j < n - 1 ; j++ ) {
                arrayHolder[j] = arrayHolder[j + 1] ;
            }
            arrayHolder[n - 1] = first ;
        }
    }

    public void printArray () {
        for ( int i = 0 ; i < arrayHolder.length ; i++ ) {
            System.out.print ( arrayHolder[i] + " " ) ;
        }
        System.out.println () ;
    }
}

class RotateArrayLeftRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter the size of the array : " ) ;
        int size = input.nextInt () ;
        int[] arr = new int[size] ;

        System.out.println ( "Enter the elements of the array : " ) ;
        for ( int i = 0 ; i < size ; i++ ) {
            arr[i] = input.nextInt () ;
        }

        System.out.print ( "Enter number of positions to rotate left : " ) ;
        int k = input.nextInt () ;

        RotateArrayLeft rotator = new RotateArrayLeft ( arr , k ) ;
        rotator.rotate () ;

        System.out.print ( "Array after left rotation : " ) ;
        rotator.printArray () ;

        input.close () ;
    }
}
