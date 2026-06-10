package Day_8 ;

import java.util.Scanner ;

public class RepeatedNumberPattern {
    private int rowsHolder ;

    public RepeatedNumberPattern ( int a ) {
        this.rowsHolder = a ;
    }

    public String primaryManager () {
        StringBuilder pattern = new StringBuilder () ;
        pattern.append( "\n" ) ;

        for ( int i = 1 ; i <= rowsHolder ; i++ ) {
            for ( int j = 1 ; j <= i ; j++ ) {
                pattern.append( i ) ;
            }
            pattern.append( "\n" ) ;
        }

        return pattern.toString() ;
    }
}

class RepeatedNumberPatternRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter number of rows : " ) ;
        int x = input.nextInt() ;
        RepeatedNumberPattern num = new RepeatedNumberPattern ( x ) ;
        System.out.println( "The repeated-number pattern is : " + num.primaryManager() ) ;
        input.close() ;
    }
}