package Day_20 ;

import java.util.Scanner ;

public class SymmetricMatrixChecker {
    private int[][] matrixHolder ;

    public SymmetricMatrixChecker ( int[][] a ) {
        this.matrixHolder = a ;
    }

    public boolean primaryManager () {
        int rows = matrixHolder.length ;
        int cols = matrixHolder[0].length ;

        if ( rows != cols ) return false ;

        for ( int i = 0 ; i < rows ; i++ ) {
            for ( int j = 0 ; j < cols ; j++ ) {
                if ( matrixHolder[i][j] != matrixHolder[j][i] ) return false ;
            }
        }

        return true ;
    }
}

class SymmetricMatrixCheckerRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter rows and columns of matrix : " ) ;
        int r = input.nextInt() ;
        int c = input.nextInt() ;

        int[][] m = new int[r][c] ;
        System.out.println( "Enter elements of the matrix : " ) ;
        for ( int i = 0 ; i < r ; i++ ) {
            for ( int j = 0 ; j < c ; j++ ) {
                m[i][j] = input.nextInt() ;
            }
        }

        SymmetricMatrixChecker num = new SymmetricMatrixChecker ( m ) ;
        if ( num.primaryManager() ) {
            System.out.println( "The matrix is symmetric." ) ;
        } else {
            System.out.println( "The matrix is not symmetric." ) ;
        }
        input.close() ;
    }
}

