package Day_17 ;

import java.util.Scanner ;

public class MergeArrays {
    private int[] arr1Holder ;
    private int[] arr2Holder ;

    public MergeArrays ( int[] a, int[] b ) {
        this.arr1Holder = a ;
        this.arr2Holder = b ;
    }

    public String primaryManager () {
        int[] merged = new int[arr1Holder.length + arr2Holder.length] ;
        int index = 0 ;
        
        for ( int i = 0 ; i < arr1Holder.length ; i++ ) {
            merged[index++] = arr1Holder[i] ;
        }
        for ( int i = 0 ; i < arr2Holder.length ; i++ ) {
            merged[index++] = arr2Holder[i] ;
        }
        
        StringBuilder result = new StringBuilder () ;
        for ( int i = 0 ; i < merged.length ; i++ ) {
            result.append( merged[i] ).append( " " ) ;
        }
        
        return result.toString().trim() ;
    }
}

class MergeArraysRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        
        System.out.print( "Enter size of first array : " ) ;
        int n1 = input.nextInt() ;
        int[] x = new int[n1] ;
        System.out.println( "Enter " + n1 + " elements : " ) ;
        for ( int i = 0 ; i < n1 ; i++ ) {
            x[i] = input.nextInt() ;
        }
        
        System.out.print( "Enter size of second array : " ) ;
        int n2 = input.nextInt() ;
        int[] y = new int[n2] ;
        System.out.println( "Enter " + n2 + " elements : " ) ;
        for ( int i = 0 ; i < n2 ; i++ ) {
            y[i] = input.nextInt() ;
        }
        
        MergeArrays num = new MergeArrays ( x, y ) ;
        System.out.println( "Merged array : " + num.primaryManager() ) ;
        input.close() ;
    }
}

