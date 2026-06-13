package Day_13 ;

import java.util.Scanner ;

public class ArrayDisplay {
    private int[] arrHolder ;

    public ArrayDisplay ( int[] a ) {
        this.arrHolder = a ;
    }

    public String primaryManager () {
        StringBuilder result = new StringBuilder () ;
        for ( int i = 0 ; i < arrHolder.length ; i++ ) {
            result.append( arrHolder[i] ).append( " " ) ;
        }
        return result.toString() ;
    }
}

class ArrayDisplayRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter the size of the array : " ) ;
        int n = input.nextInt() ;
        int[] x = new int[n] ;
        System.out.println( "Enter " + n + " elements : " ) ;
        for ( int i = 0 ; i < n ; i++ ) {
            x[i] = input.nextInt() ;
        }
        ArrayDisplay num = new ArrayDisplay ( x ) ;
        System.out.println( "The array elements are : " + num.primaryManager() ) ;
        input.close() ;
    }
}