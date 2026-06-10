package Day_08;

import java.util.Scanner ;

public class HalfPyramidPattern {
    private int rowsHolder ;

    public HalfPyramidPattern ( int a ) {
        this.rowsHolder = a ;
    }

    public String primaryManager () {
        StringBuilder pattern = new StringBuilder () ;
        pattern.append( "\n" ) ;

        for ( int i = 1 ; i <= rowsHolder ; i++ ) {
            for ( int j = 1 ; j <= i ; j++ ) {
                pattern.append( "* " ) ;
            }
            pattern.append( "\n" ) ;
        }

        return pattern.toString() ;
    }
}

class HalfPyramidPatternRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter number of rows : " ) ;
        int x = input.nextInt() ;
        HalfPyramidPattern num = new HalfPyramidPattern ( x ) ;
        System.out.println( "The half pyramid pattern is : " + num.primaryManager() ) ;
        input.close() ;
    }
}