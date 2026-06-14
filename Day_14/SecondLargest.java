package Day_14;

import java.util.Scanner;

public class SecondLargest {
    private int[] arrayHolder ;

    public SecondLargest ( int[] arr ) {
        this.arrayHolder = arr ;
    }

    public int findSecondLargest () {
        if ( arrayHolder.length < 2 ) {
            return -1 ;
        }

        int largest = Integer.MIN_VALUE ;
        int secondLargest = Integer.MIN_VALUE ;

        for ( int i = 0 ; i < arrayHolder.length ; i++ ) {
            if ( arrayHolder[i] > largest ) {
                secondLargest = largest ;
                largest = arrayHolder[i] ;
            } else if ( arrayHolder[i] > secondLargest && arrayHolder[i] != largest ) {
                secondLargest = arrayHolder[i] ;
            }
        }
        return secondLargest ;
    }
}

class SecondLargestRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter the size of the array : " ) ;
        int size = input.nextInt () ;
        int[] arr = new int[size] ;

        System.out.println ( "Enter the elements of the array : " ) ;
        for ( int i = 0 ; i < size ; i++ ) {
            arr[i] = input.nextInt () ;
        }

        SecondLargest finder = new SecondLargest ( arr ) ;
        int result = finder.findSecondLargest () ;

        if ( result != Integer.MIN_VALUE ) {
            System.out.println ( "The second largest element is : " + result ) ;
        } else {
            System.out.println ( "No second largest element exists." ) ;
        }
        input.close () ;
    }
}
