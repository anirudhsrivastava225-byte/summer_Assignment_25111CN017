package Day_19 ;

import java.util.Scanner ;

public class DiagonalSum {
    private int[][] matrixHolder ;

    public DiagonalSum ( int[][] a ) {
        this.matrixHolder = a ;
    }

    public int primaryManager () {
        int n = matrixHolder.length ;
        int sum = 0 ;

        for ( int i = 0 ; i < n ; i++ ) {
            sum += matrixHolder[i][i] ;
            if ( i != n - 1 - i ) {
                sum += matrixHolder[i][n - 1 - i] ;
            }
        }

        return sum ;
    }
}

class DiagonalSumRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter the size of the square matrix : " ) ;
        int n = input.nextInt() ;

        int[][] m = new int[n][n] ;
        System.out.println( "Enter elements of the matrix : " ) ;
        for ( int i = 0 ; i < n ; i++ ) {
            for ( int j = 0 ; j < n ; j++ ) {
                m[i][j] = input.nextInt() ;
            }
        }

        DiagonalSum num = new DiagonalSum ( m ) ;
        System.out.println( "The diagonal sum is : " + num.primaryManager() ) ;
        input.close() ;
    }
}
