package Day_17 ;

import java.util.Scanner ;

public class IntersectionOfArrays {
    private int[] arr1Holder ;
    private int[] arr2Holder ;

    public IntersectionOfArrays ( int[] a, int[] b ) {
        this.arr1Holder = a ;
        this.arr2Holder = b ;
    }

    public String primaryManager () {
        StringBuilder result = new StringBuilder () ;
        
        for ( int i = 0 ; i < arr1Holder.length ; i++ ) {
            boolean isDuplicate = false ;
            for ( int j = 0 ; j < i ; j++ ) {
                if ( arr1Holder[i] == arr1Holder[j] ) {
                    isDuplicate = true ;
                    break ;
                }
            }
            if ( isDuplicate ) continue ;
            
            for ( int j = 0 ; j < arr2Holder.length ; j++ ) {
                if ( arr1Holder[i] == arr2Holder[j] ) {
                    result.append( arr1Holder[i] ).append( " " ) ;
                    break ;
                }
            }
        }
        
        if ( result.length() == 0 ) return "No intersection found" ;
        return result.toString().trim() ;
    }
}

class IntersectionOfArraysRunner {
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
        
        IntersectionOfArrays num = new IntersectionOfArrays ( x, y ) ;
        System.out.println( "Intersection of arrays : " + num.primaryManager() ) ;
        input.close() ;
    }
}
