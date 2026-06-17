package Day_17 ;

import java.util.Scanner ;

public class CommonElements {
    private int[] arr1Holder ;
    private int[] arr2Holder ;
    private int[] arr3Holder ;

    public CommonElements ( int[] a, int[] b, int[] c ) {
        this.arr1Holder = a ;
        this.arr2Holder = b ;
        this.arr3Holder = c ;
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
            
            boolean inTwo = false ;
            for ( int j = 0 ; j < arr2Holder.length ; j++ ) {
                if ( arr1Holder[i] == arr2Holder[j] ) {
                    inTwo = true ;
                    break ;
                }
            }
            
            boolean inThree = false ;
            for ( int j = 0 ; j < arr3Holder.length ; j++ ) {
                if ( arr1Holder[i] == arr3Holder[j] ) {
                    inThree = true ;
                    break ;
                }
            }
            
            if ( inTwo && inThree ) {
                result.append( arr1Holder[i] ).append( " " ) ;
            }
        }
        
        if ( result.length() == 0 ) return "No common elements found" ;
        return result.toString().trim() ;
    }
}

class CommonElementsRunner {
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
        
        System.out.print( "Enter size of third array : " ) ;
        int n3 = input.nextInt() ;
        int[] z = new int[n3] ;
        System.out.println( "Enter " + n3 + " elements : " ) ;
        for ( int i = 0 ; i < n3 ; i++ ) {
            z[i] = input.nextInt() ;
        }
        
        CommonElements num = new CommonElements ( x, y, z ) ;
        System.out.println( "Common elements are : " + num.primaryManager() ) ;
        input.close() ;
    }
}
