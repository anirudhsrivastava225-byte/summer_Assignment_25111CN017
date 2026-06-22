package Day_16 ;

import java.util.Scanner ;

public class RemoveDuplicates {
    private int[] arrayHolder ;

    public RemoveDuplicates ( int[] arr ) {
        this.arrayHolder = arr ;
    }

    public int remove () {
        int n = arrayHolder.length ;
        if ( n == 0 || n == 1 ) return n ;
        int uniqueCount = 0 ;
        for ( int i = 0 ; i < n ; i++ ) {
            boolean isDuplicate = false ;
            for ( int j = 0 ; j < uniqueCount ; j++ ) {
                if ( arrayHolder[i] == arrayHolder[j] ) {
                    isDuplicate = true ;
                    break ;
                }
            }
            if ( !isDuplicate ) {
                arrayHolder[uniqueCount] = arrayHolder[i] ;
                uniqueCount++ ;
            }
        }
        return uniqueCount ;
    }

    public void printArray ( int length ) {
        for ( int i = 0 ; i < length ; i++ ) {
            System.out.print ( arrayHolder[i] + " " ) ;
        }
        System.out.println () ;
    }
}

class RemoveDuplicatesRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter the size of the array : " ) ;
        int size = input.nextInt () ;
        int[] arr = new int[size] ;

        System.out.println ( "Enter the elements of the array : " ) ;
        for ( int i = 0 ; i < size ; i++ ) {
            arr[i] = input.nextInt () ;
        }

        RemoveDuplicates processor = new RemoveDuplicates ( arr ) ;
        int newLength = processor.remove () ;

        System.out.print ( "Array after removing duplicates : " ) ;
        processor.printArray ( newLength ) ;

        input.close () ;
    }
}
