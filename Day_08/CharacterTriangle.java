package Day_08;

import java.util.Scanner ;

public class CharacterTriangle {
    private int rowsHolder ;

    public CharacterTriangle ( int a ) {
        this.rowsHolder = a ;
    }

    public String primaryManager () {
        StringBuilder pattern = new StringBuilder () ;
        pattern.append( "\n" ) ;

        for ( int i = 1 ; i <= rowsHolder ; i++ ) {
            char ch = 'A' ;
            for ( int j = 1 ; j <= i ; j++ ) {
                pattern.append( ch ) ;
                ch++ ;
            }
            pattern.append( "\n" ) ;
        }

        return pattern.toString() ;
    }
}

class CharacterTriangleRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter number of rows : " ) ;
        int x = input.nextInt() ;
        CharacterTriangle num = new CharacterTriangle ( x ) ;
        System.out.println( "The character triangle is : " + num.primaryManager() ) ;
        input.close() ;
    }
}