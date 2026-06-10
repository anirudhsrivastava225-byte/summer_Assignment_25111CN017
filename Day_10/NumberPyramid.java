package Day_10 ;

import java.util.Scanner ;

public class NumberPyramid {
    private int rowsHolder ;

    public NumberPyramid ( int a ) {
        this.rowsHolder = a ;
    }

    public String primaryManager () {
        StringBuilder pattern = new StringBuilder () ;
        pattern.append( "\n" ) ;

        for ( int i = 1 ; i <= rowsHolder ; i++ ) {
            for ( int j = 1 ; j <= rowsHolder - i ; j++ ) {
                pattern.append( " " ) ;
            }
            for ( int j = 1 ; j <= i ; j++ ) {
                pattern.append( j ) ;
            }
            for ( int j = i - 1 ; j >= 1 ; j-- ) {
                pattern.append( j ) ;
            }
            pattern.append( "\n" ) ;
        }

        return pattern.toString() ;
    }
}

class NumberPyramidRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter number of rows : " ) ;
        int x = input.nextInt() ;
        NumberPyramid num = new NumberPyramid ( x ) ;
        System.out.println( "The number pyramid is : " + num.primaryManager() ) ;
        input.close() ;
    }
}