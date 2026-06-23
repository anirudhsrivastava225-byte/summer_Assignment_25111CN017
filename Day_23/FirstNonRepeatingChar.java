package Day_23 ;

import java.util.Scanner ;

public class FirstNonRepeatingChar {
    private String stringHolder ;

    public FirstNonRepeatingChar ( String s ) {
        this.stringHolder = s ;
    }

    public char findFirstNonRepeating () {
        int[] freq = new int[256] ;

        for ( int i = 0 ; i < stringHolder.length () ; i++ ) {
            freq[stringHolder.charAt ( i )]++ ;
        }

        for ( int i = 0 ; i < stringHolder.length () ; i++ ) {
            if ( freq[stringHolder.charAt ( i )] == 1 ) {
                return stringHolder.charAt ( i ) ;
            }
        }
        return '\0' ;
    }
}

class FirstNonRepeatingCharRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter a string : " ) ;
        String s = input.nextLine () ;

        FirstNonRepeatingChar finder = new FirstNonRepeatingChar ( s ) ;
        char result = finder.findFirstNonRepeating () ;

        if ( result != '\0' ) {
            System.out.println ( "The first non-repeating character is : " + result ) ;
        } else {
            System.out.println ( "No non-repeating character found." ) ;
        }
        input.close () ;
    }
}
