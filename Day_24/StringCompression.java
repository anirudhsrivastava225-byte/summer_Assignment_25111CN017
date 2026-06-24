package Day_24 ;

import java.util.Scanner ;

public class StringCompression {
    private String stringHolder ;

    public StringCompression ( String s ) {
        this.stringHolder = s ;
    }

    public String compress () {
        if ( stringHolder == null || stringHolder.isEmpty () ) {
            return stringHolder ;
        }

        StringBuilder compressed = new StringBuilder () ;
        int count = 1 ;

        for ( int i = 0 ; i < stringHolder.length () ; i++ ) {
            if ( i + 1 < stringHolder.length () && stringHolder.charAt ( i ) == stringHolder.charAt ( i + 1 ) ) {
                count++ ;
            } else {
                compressed.append ( stringHolder.charAt ( i ) ) ;
                compressed.append ( count ) ;
                count = 1 ;
            }
        }

        return compressed.length () < stringHolder.length () ? compressed.toString () : stringHolder ;
    }
}

class StringCompressionRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter string to compress : " ) ;
        String s = input.nextLine () ;

        StringCompression processor = new StringCompression ( s ) ;
        System.out.println ( "Compressed string : " + processor.compress () ) ;
        input.close () ;
    }
}
