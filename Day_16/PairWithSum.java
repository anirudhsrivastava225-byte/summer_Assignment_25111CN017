package Day_16 ;

import java.util.Scanner ;

public class PairWithSum {
    private int[] arrayHolder ;
    private int sumHolder ;

    public PairWithSum ( int[] arr , int targetSum ) {
        this.arrayHolder = arr ;
        this.sumHolder = targetSum ;
    }

    public void findPairs () {
        boolean found = false ;
        for ( int i = 0 ; i < arrayHolder.length ; i++ ) {
            for ( int j = i + 1 ; j < arrayHolder.length ; j++ ) {
                if ( arrayHolder[i] + arrayHolder[j] == sumHolder ) {
                    System.out.println ( "Pair found : ( " + arrayHolder[i] + " , " + arrayHolder[j] + " )" ) ;
                    found = true ;
                }
            }
        }
        if ( !found ) {
            System.out.println ( "No pair exists with the given sum." ) ;
        }
    }
}

class PairWithSumRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter the size of the array : " ) ;
        int size = input.nextInt () ;
        int[] arr = new int[size] ;

        System.out.println ( "Enter the elements of the array : " ) ;
        for ( int i = 0 ; i < size ; i++ ) {
            arr[i] = input.nextInt () ;
        }

        System.out.print ( "Enter the target sum : " ) ;
        int target = input.nextInt () ;

        PairWithSum solver = new PairWithSum ( arr , target ) ;
        solver.findPairs () ;

        input.close () ;
    }
}
