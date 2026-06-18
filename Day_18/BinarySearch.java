package Day_18 ;

import java.util.Scanner ;

class BinarySearch {
    private int[] arrHolder ;
    private int targetHolder ;

    public BinarySearch ( int[] a, int b ) {
        this.arrHolder = a ;
        this.targetHolder = b ;
    }

    public int primaryManager () {
        int left = 0 ;
        int right = arrHolder.length - 1 ;
        
        while ( left <= right ) {
            int mid = left + ( right - left ) / 2 ;
            
            if ( arrHolder[mid] == targetHolder ) return mid ;
            
            if ( arrHolder[mid] < targetHolder ) {
                left = mid + 1 ;
            } else {
                right = mid - 1 ;
            }
        }
        return -1 ;
    }
}

class BinarySearchRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter the size of the sorted array : " ) ;
        int n = input.nextInt() ;
        int[] x = new int[n] ;
        System.out.println( "Enter " + n + " sorted elements : " ) ;
        for ( int i = 0 ; i < n ; i++ ) {
            x[i] = input.nextInt() ;
        }
        System.out.print( "Enter the element to search : " ) ;
        int target = input.nextInt() ;
        BinarySearch num = new BinarySearch ( x, target ) ;
        int result = num.primaryManager() ;
        if ( result != -1 ) {
            System.out.println( "Element found at index : " + result ) ;
        } else {
            System.out.println( "Element not found in the array." ) ;
        }
        input.close() ;
    }
}
