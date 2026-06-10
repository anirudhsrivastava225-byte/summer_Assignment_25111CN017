package Day_10 ;

import java.util.Scanner ;

public class ReversePyramid {
    private int rowsHolder ;

    public ReversePyramid ( int a ) {
        this.rowsHolder = a ;
    }

    public String primaryManager () {
        StringBuilder pattern = new StringBuilder () ;
        pattern.append( "\n" ) ;

        for ( int i = rowsHolder ; i >= 1 ; i-- ) {
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

class ReversePyramidRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter number of rows : " ) ;
        int x = input.nextInt() ;
        ReversePyramid num = new ReversePyramid ( x ) ;
        System.out.println( "The reverse pyramid is : " + num.primaryManager() ) ;
        input.close() ;
    }
}