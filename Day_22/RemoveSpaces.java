package Day_22 ;

import java.util.Scanner ;

public class RemoveSpaces {
    private String stringHolder ;

    public RemoveSpaces ( String s ) {
        this.stringHolder = s ;
    }

    public String remove () {
        StringBuilder result = new StringBuilder () ;
        for ( int i = 0 ; i < stringHolder.length () ; i++ ) {
            if ( stringHolder.charAt ( i ) != ' ' ) {
                result.append ( stringHolder.charAt ( i ) ) ;
            }
        }
        return result.toString () ;
    }
}

class RemoveSpacesRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter a string with spaces : " ) ;
        String s = input.nextLine () ;

        RemoveSpaces processor = new RemoveSpaces ( s ) ;
        System.out.println ( "String after removing spaces : " + processor.remove () ) ;
        input.close () ;
    }
}
