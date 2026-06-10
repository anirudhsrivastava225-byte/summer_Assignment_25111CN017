package Day_10 ;

import java.util.Scanner ;

public class CharacterPyramid {
    private int rowsHolder ;

    public CharacterPyramid ( int a ) {
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
                pattern.append( (char) ( 'A' + j - 1 ) ) ;
            }
            for ( int j = i - 1 ; j >= 1 ; j-- ) {
                pattern.append( (char) ( 'A' + j - 1 ) ) ;
            }
            pattern.append( "\n" ) ;
        }

        return pattern.toString() ;
    }
}

class CharacterPyramidRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter number of rows : " ) ;
        int x = input.nextInt() ;
        CharacterPyramid num = new CharacterPyramid ( x ) ;
        System.out.println( "The character pyramid is : " + num.primaryManager() ) ;
        input.close() ;
    }
}