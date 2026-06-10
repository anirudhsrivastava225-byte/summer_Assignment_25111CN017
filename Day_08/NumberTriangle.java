package Day_8 ;

import java.util.Scanner ;

public class NumberTriangle {
    private int rowsHolder ;

    public NumberTriangle ( int a ) {
        this.rowsHolder = a ;
    }

    public String primaryManager () {
        StringBuilder pattern = new StringBuilder () ;
        pattern.append( "\n" ) ;

        for ( int i = 1 ; i <= rowsHolder ; i++ ) {
            for ( int j = 1 ; j <= i ; j++ ) {
                pattern.append( j ) ;
            }
            pattern.append( "\n" ) ;
        }

        return pattern.toString() ;
    }
}

class NumberTriangleRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter number of rows : " ) ;
        int x = input.nextInt() ;
        NumberTriangle num = new NumberTriangle ( x ) ;
        System.out.println( "The number triangle is : " + num.primaryManager() ) ;
        input.close() ;
    }
}