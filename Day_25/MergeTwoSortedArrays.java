package Day_25 ;

import java.util.Scanner ;

public class MergeTwoSortedArrays {
    private int[] firstHolder ;
    private int[] secondHolder ;

    public MergeTwoSortedArrays ( int[] arr1 , int[] arr2 ) {
        this.firstHolder = arr1 ;
        this.secondHolder = arr2 ;
    }

    public int[] merge () {
        int n1 = firstHolder.length ;
        int n2 = secondHolder.length ;
        int[] merged = new int[n1 + n2] ;

        int i = 0 , j = 0 , k = 0 ;
        while ( i < n1 && j < n2 ) {
            if ( firstHolder[i] <= secondHolder[j] ) {
                merged[k++] = firstHolder[i++] ;
            } else {
                merged[k++] = secondHolder[j++] ;
            }
        }

        while ( i < n1 ) {
            merged[k++] = firstHolder[i++] ;
        }

        while ( j < n2 ) {
            merged[k++] = secondHolder[j++] ;
        }

        return merged ;
    }
}

class MergeTwoSortedArraysRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;

        System.out.print ( "Enter size of first sorted array : " ) ;
        int n1 = input.nextInt () ;
        int[] arr1 = new int[n1] ;
        System.out.println ( "Enter elements : " ) ;
        for ( int i = 0 ; i < n1 ; i++ ) {
            arr1[i] = input.nextInt () ;
        }

        System.out.print ( "Enter size of second sorted array : " ) ;
        int n2 = input.nextInt () ;
        int[] arr2 = new int[n2] ;
        System.out.println ( "Enter elements : " ) ;
        for ( int i = 0 ; i < n2 ; i++ ) {
            arr2[i] = input.nextInt () ;
        }

        MergeTwoSortedArrays merger = new MergeTwoSortedArrays ( arr1 , arr2 ) ;
        int[] result = merger.merge () ;

        System.out.print ( "Merged Array : " ) ;
        for ( int x : result ) {
            System.out.print ( x + " " ) ;
        }
        System.out.println () ;

        input.close () ;
    }
}
