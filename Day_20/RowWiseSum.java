package Day_20 ;

import java.util.Scanner ;

public class RowWiseSum {
    private int[][] matrixHolder ;

    public RowWiseSum ( int[][] a ) {
        this.matrixHolder = a ;
    }

    public String primaryManager () {
        int rows = matrixHolder.length ;
        int cols = matrixHolder[0].length ;
        StringBuilder output = new StringBuilder () ;
        output.append( "\n" ) ;

        for ( int i = 0 ; i < rows ; i++ ) {
            int sum = 0 ;
            for ( int j = 0 ; j < cols ; j++ ) {
                sum += matrixHolder[i][j] ;
            }
            output.append( "Row " ).append( i + 1 ).append( " sum: " ).append( sum ).append( "\n" ) ;
        }

        return output.toString() ;
    }
}

class RowWiseSumRunner {
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

        RowWiseSum num = new RowWiseSum ( m ) ;
        System.out.println( "Row-wise sum is : " + num.primaryManager() ) ;
        input.close() ;
    }
}
