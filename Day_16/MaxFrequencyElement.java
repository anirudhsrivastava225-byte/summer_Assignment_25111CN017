package Day_16 ;

import java.util.Scanner ;

public class MaxFrequencyElement {
    private int[] arrayHolder ;

    public MaxFrequencyElement ( int[] arr ) {
        this.arrayHolder = arr ;
    }

    public int findMaxFrequency () {
        int maxCount = 0 ;
        int maxElement = arrayHolder[0] ;

        for ( int i = 0 ; i < arrayHolder.length ; i++ ) {
            int count = 0 ;
            for ( int j = 0 ; j < arrayHolder.length ; j++ ) {
                if ( arrayHolder[i] == arrayHolder[j] ) {
                    count++ ;
                }
            }
            if ( count > maxCount ) {
                maxCount = count ;
                maxElement = arrayHolder[i] ;
            }
        }
        return maxElement ;
    }
}

class MaxFrequencyElementRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter the size of the array : " ) ;
        int size = input.nextInt () ;
        int[] arr = new int[size] ;

        System.out.println ( "Enter the elements of the array : " ) ;
        for ( int i = 0 ; i < size ; i++ ) {
            arr[i] = input.nextInt () ;
        }

        MaxFrequencyElement finder = new MaxFrequencyElement ( arr ) ;
        System.out.println ( "Element with maximum frequency is : " + finder.findMaxFrequency () ) ;

        input.close () ;
    }
}
