package Day_14;

import java.util.Scanner;

public class FindDuplicates {
    private int[] arrayHolder ;

    public FindDuplicates ( int[] arr ) {
        this.arrayHolder = arr ;
    }

    public void printDuplicates () {
        boolean found = false ;
        boolean[] visited = new boolean[arrayHolder.length] ;

        for ( int i = 0 ; i < arrayHolder.length ; i++ ) {
            if ( visited[i] ) continue ;

            boolean isDuplicate = false ;
            for ( int j = i + 1 ; j < arrayHolder.length ; j++ ) {
                if ( arrayHolder[i] == arrayHolder[j] ) {
                    isDuplicate = true ;
                    visited[j] = true ;
                }
            }

            if ( isDuplicate ) {
                System.out.print ( arrayHolder[i] + " " ) ;
                found = true ;
            }
        }

        if ( !found ) {
            System.out.print ( "No duplicates found." ) ;
        }
        System.out.println () ;
    }
}

class FindDuplicatesRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter the size of the array : " ) ;
        int size = input.nextInt () ;
        int[] arr = new int[size] ;

        System.out.println ( "Enter the elements of the array : " ) ;
        for ( int i = 0 ; i < size ; i++ ) {
            arr[i] = input.nextInt () ;
        }

        FindDuplicates detector = new FindDuplicates ( arr ) ;
        System.out.print ( "Duplicate elements in the array are : " ) ;
        detector.printDuplicates () ;

        input.close () ;
    }
}
