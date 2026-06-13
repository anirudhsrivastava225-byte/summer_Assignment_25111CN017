package Day_13 ;

import java.util.Scanner ;

public class ArraySumAverage {
    private int[] arrHolder ;

    public ArraySumAverage ( int[] a ) {
        this.arrHolder = a ;
    }

    public String primaryManager () {
        int sum = 0 ;
        for ( int i = 0 ; i < arrHolder.length ; i++ ) {
            sum += arrHolder[i] ;
        }
        double average = (double) sum / arrHolder.length ;
        return "Sum = " + sum + ", Average = " + average ;
    }
}

class ArraySumAverageRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter the size of the array : " ) ;
        int n = input.nextInt() ;
        int[] x = new int[n] ;
        System.out.println( "Enter " + n + " elements : " ) ;
        for ( int i = 0 ; i < n ; i++ ) {
            x[i] = input.nextInt() ;
        }
        ArraySumAverage num = new ArraySumAverage ( x ) ;
        System.out.println( num.primaryManager() ) ;
        input.close() ;
    }
}