package Day_15 ;

import java.util.Scanner ;

public class ReverseArray {
    private int[] arrayHolder ;

    public ReverseArray ( int[] arr ) {
        this.arrayHolder = arr ;
    }

    public void reverse () {
        int left = 0 ;
        int right = arrayHolder.length - 1 ;
        while ( left < right ) {
            int temp = arrayHolder[left] ;
            arrayHolder[left] = arrayHolder[right] ;
            arrayHolder[right] = temp ;
            left++ ;
            right-- ;
        }
    }

    public void printArray () {
        for ( int i = 0 ; i < arrayHolder.length ; i++ ) {
            System.out.print ( arrayHolder[i] + " " ) ;
        }
        System.out.println () ;
    }
}

class ReverseArrayRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter the size of the array : " ) ;
        int size = input.nextInt () ;
        int[] arr = new int[size] ;

        System.out.println ( "Enter the elements of the array : " ) ;
        for ( int i = 0 ; i < size ; i++ ) {
            arr[i] = input.nextInt () ;
        }

        ReverseArray reverser = new ReverseArray ( arr ) ;
        reverser.reverse () ;

        System.out.print ( "Reversed array : " ) ;
        reverser.printArray () ;

        input.close () ;
    }
}
