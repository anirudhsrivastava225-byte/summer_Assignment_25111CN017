package Day_9 ;

import java.util.Scanner ;

public class RepeatedCharacterPattern {
    private int rowsHolder ;

    public RepeatedCharacterPattern ( int a ) {
        this.rowsHolder = a ;
    }

    public String primaryManager () {
        StringBuilder pattern = new StringBuilder () ;
        pattern.append( "\n" ) ;

        for ( int i = 1 ; i <= rowsHolder ; i++ ) {
            char ch = (char) ( 'A' + i - 1 ) ;
            for ( int j = 1 ; j <= i ; j++ ) {
                pattern.append( ch ) ;
            }
            pattern.append( "\n" ) ;
        }

        return pattern.toString() ;
    }
}

class RepeatedCharacterPatternRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter number of rows : " ) ;
        int x = input.nextInt() ;
        RepeatedCharacterPattern num = new RepeatedCharacterPattern ( x ) ;
        System.out.println( "The repeated character pattern is : " + num.primaryManager() ) ;
        input.close() ;
    }
}