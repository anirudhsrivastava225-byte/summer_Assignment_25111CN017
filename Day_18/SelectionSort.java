package Day_18 ;

import java.util.Scanner ;

class SelectionSort {
    private int[] arrHolder ;

    public SelectionSort ( int[] a ) {
        this.arrHolder = a ;
    }

    public String primaryManager () {
        int n = arrHolder.length ;
        for ( int i = 0 ; i < n - 1 ; i++ ) {
            int minIdx = i ;
            for ( int j = i + 1 ; j < n ; j++ ) {
                if ( arrHolder[j] < arrHolder[minIdx] ) {
                    minIdx = j ;
                }
            }
            int temp = arrHolder[minIdx] ;
            arrHolder[minIdx] = arrHolder[i] ;
            arrHolder[i] = temp ;
        }
        
        StringBuilder result = new StringBuilder () ;
        for ( int i = 0 ; i < n ; i++ ) {
            result.append( arrHolder[i] ).append( " " ) ;
        }
        return result.toString().trim() ;
    }
}

class SelectionSortRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter the size of the array : " ) ;
        int n = input.nextInt() ;
        int[] x = new int[n] ;
        System.out.println( "Enter " + n + " elements : " ) ;
        for ( int i = 0 ; i < n ; i++ ) {
            x[i] = input.nextInt() ;
        }
        SelectionSort num = new SelectionSort ( x ) ;
        System.out.println( "Sorted array : " + num.primaryManager() ) ;
        input.close() ;
    }
}
