package Day_20 ;

import java.util.Scanner ;

public class MatrixMultiplication {
    private int[][] matrix1Holder ;
    private int[][] matrix2Holder ;

    public MatrixMultiplication ( int[][] a, int[][] b ) {
        this.matrix1Holder = a ;
        this.matrix2Holder = b ;
    }

    public String primaryManager () {
        int r1 = matrix1Holder.length ;
        int c1 = matrix1Holder[0].length ;
        int r2 = matrix2Holder.length ;
        int c2 = matrix2Holder[0].length ;

        if ( c1 != r2 ) return "Multiplication not possible" ;

        int[][] result = new int[r1][c2] ;
        StringBuilder output = new StringBuilder () ;
        output.append( "\n" ) ;

        for ( int i = 0 ; i < r1 ; i++ ) {
            for ( int j = 0 ; j < c2 ; j++ ) {
                for ( int k = 0 ; k < c1 ; k++ ) {
                    result[i][j] += matrix1Holder[i][k] * matrix2Holder[k][j] ;
                }
                output.append( result[i][j] ).append( " " ) ;
            }
            output.append( "\n" ) ;
        }

        return output.toString() ;
    }
}

class MatrixMultiplicationRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        
        System.out.print( "Enter rows and columns for first matrix : " ) ;
        int r1 = input.nextInt() ;
        int c1 = input.nextInt() ;
        int[][] m1 = new int[r1][c1] ;
        System.out.println( "Enter elements of first matrix : " ) ;
        for ( int i = 0 ; i < r1 ; i++ ) {
            for ( int j = 0 ; j < c1 ; j++ ) {
                m1[i][j] = input.nextInt() ;
            }
        }

        System.out.print( "Enter rows and columns for second matrix : " ) ;
        int r2 = input.nextInt() ;
        int c2 = input.nextInt() ;
        int[][] m2 = new int[r2][c2] ;
        System.out.println( "Enter elements of second matrix : " ) ;
        for ( int i = 0 ; i < r2 ; i++ ) {
            for ( int j = 0 ; j < c2 ; j++ ) {
                m2[i][j] = input.nextInt() ;
            }
        }

        MatrixMultiplication num = new MatrixMultiplication ( m1, m2 ) ;
        System.out.println( "Product of matrices : " + num.primaryManager() ) ;
        input.close() ;
    }
}
