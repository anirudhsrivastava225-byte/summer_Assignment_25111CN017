package Day_19 ;

import java.util.Scanner ;

public class MatrixTranspose {
    private int[][] matrixHolder ;

    public MatrixTranspose ( int[][] a ) {
        this.matrixHolder = a ;
    }

    public String primaryManager () {
        int rows = matrixHolder.length ;
        int cols = matrixHolder[0].length ;
        int[][] result = new int[cols][rows] ;
        StringBuilder output = new StringBuilder () ;
        output.append( "\n" ) ;

        for ( int i = 0 ; i < cols ; i++ ) {
            for ( int j = 0 ; j < rows ; j++ ) {
                result[i][j] = matrixHolder[j][i] ;
                output.append( result[i][j] ).append( " " ) ;
            }
            output.append( "\n" ) ;
        }

        return output.toString() ;
    }
}

class MatrixTransposeRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter rows and columns : " ) ;
        int r = input.nextInt() ;
        int c = input.nextInt() ;

        int[][] m = new int[r][c] ;
        System.out.println( "Enter elements of the matrix : " ) ;
        for ( int i = 0 ; i < r ; i++ ) {
            for ( int j = 0 ; j < c ; j++ ) {
                m[i][j] = input.nextInt() ;
            }
        }

        MatrixTranspose num = new MatrixTranspose ( m ) ;
        System.out.println( "Transposed matrix : " + num.primaryManager() ) ;
        input.close() ;
    }
}
