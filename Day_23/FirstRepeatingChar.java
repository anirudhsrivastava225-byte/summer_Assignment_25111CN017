package Day_23 ;

import java.util.Scanner ;

public class FirstRepeatingChar {
    private String stringHolder ;

    public FirstRepeatingChar ( String s ) {
        this.stringHolder = s ;
    }

    public char findFirstRepeating () {
        int[] freq = new int[256] ;

        for ( int i = 0 ; i < stringHolder.length () ; i++ ) {
            char ch = stringHolder.charAt ( i ) ;
            if ( freq[ch] > 0 ) {
                return ch ;
            }
            freq[ch]++ ;
        }
        return '\0' ;
    }
}

class FirstRepeatingCharRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter a string : " ) ;
        String s = input.nextLine () ;

        FirstRepeatingChar finder = new FirstRepeatingChar ( s ) ;
        char result = finder.findFirstRepeating () ;

        if ( result != '\0' ) {
            System.out.println ( "The first repeating character is : " + result ) ;
        } else {
            System.out.println ( "No repeating character found." ) ;
        }
        input.close () ;
    }
}
