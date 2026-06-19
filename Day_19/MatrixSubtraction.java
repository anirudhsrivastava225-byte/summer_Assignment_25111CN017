package Day_19 ;

import java.util.Scanner ;

public class MatrixSubtraction {
    private int[][] matrix1Holder ;
    private int[][] matrix2Holder ;

    public MatrixSubtraction ( int[][] a, int[][] b ) {
        this.matrix1Holder = a ;
        this.matrix2Holder = b ;
    }

    public String primaryManager () {
        int rows = matrix1Holder.length ;
        int cols = matrix1Holder[0].length ;
        int[][] result = new int[rows][cols] ;
        StringBuilder output = new StringBuilder () ;
        output.append( "\n" ) ;

        for ( int i = 0 ; i < rows ; i++ ) {
            for ( int j = 0 ; j < cols ; j++ ) {
                result[i][j] = matrix1Holder[i][j] - matrix2Holder[i][j] ;
                output.append( result[i][j] ).append( " " ) ;
            }
            output.append( "\n" ) ;
        }

        return output.toString() ;
    }
}

class MatrixSubtractionRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter rows and columns : " ) ;
        int r = input.nextInt() ;
        int c = input.nextInt() ;

        int[][] m1 = new int[r][c] ;
        System.out.println( "Enter elements of first matrix : " ) ;
        for ( int i = 0 ; i < r ; i++ ) {
            for ( int j = 0 ; j < c ; j++ ) {
                m1[i][j] = input.nextInt() ;
            }
        }

        int[][] m2 = new int[r][c] ;
        System.out.println( "Enter elements of second matrix : " ) ;
        for ( int i = 0 ; i < r ; i++ ) {
            for ( int j = 0 ; j < c ; j++ ) {
                m2[i][j] = input.nextInt() ;
            }
        }

        MatrixSubtraction num = new MatrixSubtraction ( m1, m2 ) ;
        System.out.println( "Difference of matrices : " + num.primaryManager() ) ;
        input.close() ;
    }
}
