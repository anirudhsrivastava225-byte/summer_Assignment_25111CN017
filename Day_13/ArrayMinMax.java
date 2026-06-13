package Day_13 ;

import java.util.Scanner ;

public class ArrayMinMax {
    private int[] arrHolder ;

    public ArrayMinMax ( int[] a ) {
        this.arrHolder = a ;
    }

    public String primaryManager () {
        if ( arrHolder.length == 0 ) return "" ;
        int smallest = arrHolder[0] ;
        int largest = arrHolder[0] ;

        for ( int i = 1 ; i < arrHolder.length ; i++ ) {
            if ( arrHolder[i] < smallest ) smallest = arrHolder[i] ;
            if ( arrHolder[i] > largest ) largest = arrHolder[i] ;
        }

        return "Smallest = " + smallest + ", Largest = " + largest ;
    }
}

class ArrayMinMaxRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter the size of the array : " ) ;
        int n = input.nextInt() ;
        int[] x = new int[n] ;
        System.out.println( "Enter " + n + " elements : " ) ;
        for ( int i = 0 ; i < n ; i++ ) {
            x[i] = input.nextInt() ;
        }
        ArrayMinMax num = new ArrayMinMax ( x ) ;
        System.out.println( num.primaryManager() ) ;
        input.close() ;
    }
}