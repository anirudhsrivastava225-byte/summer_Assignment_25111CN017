package Day_24 ;

import java.util.Scanner ;

public class RemoveDuplicateChars {
    private String stringHolder ;

    public RemoveDuplicateChars ( String s ) {
        this.stringHolder = s ;
    }

    public String remove () {
        StringBuilder result = new StringBuilder () ;
        boolean[] seen = new boolean[256] ;

        for ( int i = 0 ; i < stringHolder.length () ; i++ ) {
            char ch = stringHolder.charAt ( i ) ;
            if ( !seen[ch] ) {
                result.append ( ch ) ;
                seen[ch] = true ;
            }
        }
        return result.toString () ;
    }
}

class RemoveDuplicateCharsRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter a string : " ) ;
        String s = input.nextLine () ;

        RemoveDuplicateChars processor = new RemoveDuplicateChars ( s ) ;
        System.out.println ( "String after removing duplicates : " + processor.remove () ) ;
        input.close () ;
    }
}
