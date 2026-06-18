package Day_18 ;

import java.util.Scanner ;

class BubbleSort {
    private int[] arrHolder ;

    public BubbleSort ( int[] a ) {
        this.arrHolder = a ;
    }

    public String primaryManager () {
        int n = arrHolder.length ;
        for ( int i = 0 ; i < n - 1 ; i++ ) {
            for ( int j = 0 ; j < n - i - 1 ; j++ ) {
                if ( arrHolder[j] > arrHolder[j + 1] ) {
                    int temp = arrHolder[j] ;
                    arrHolder[j] = arrHolder[j + 1] ;
                    arrHolder[j + 1] = temp ;
                }
            }
        }
        
        StringBuilder result = new StringBuilder () ;
        for ( int i = 0 ; i < n ; i++ ) {
            result.append( arrHolder[i] ).append( " " ) ;
        }
        return result.toString().trim() ;
    }
}

class BubbleSortRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter the size of the array : " ) ;
        int n = input.nextInt() ;
        int[] x = new int[n] ;
        System.out.println( "Enter " + n + " elements : " ) ;
        for ( int i = 0 ; i < n ; i++ ) {
            x[i] = input.nextInt() ;
        }
        BubbleSort num = new BubbleSort ( x ) ;
        System.out.println( "Sorted array : " + num.primaryManager() ) ;
        input.close() ;
    }
}
