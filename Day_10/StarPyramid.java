package Day_10 ;

import java.util.Scanner ;

public class StarPyramid {
    private int rowsHolder ;

    public StarPyramid ( int a ) {
        this.rowsHolder = a ;
    }

    public String primaryManager () {
        StringBuilder pattern = new StringBuilder () ;
        pattern.append( "\n" ) ;

        for ( int i = 1 ; i <= rowsHolder ; i++ ) {
            for ( int j = 1 ; j <= rowsHolder - i ; j++ ) {
                pattern.append( " " ) ;
            }
            for ( int k = 1 ; k <= ( 2 * i - 1 ) ; k++ ) {
                pattern.append( "*" ) ;
            }
            pattern.append( "\n" ) ;
        }

        return pattern.toString() ;
    }
}

class StarPyramidRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter number of rows : " ) ;
        int x = input.nextInt() ;
        StarPyramid num = new StarPyramid ( x ) ;
        System.out.println( "The star pyramid is : " + num.primaryManager() ) ;
        input.close() ;
    }
}
