package Day_22 ;

import java.util.Scanner ;

public class CharacterFrequency {
    private String stringHolder ;

    public CharacterFrequency ( String s ) {
        this.stringHolder = s ;
    }

    public void findFrequency () {
        int[] freq = new int[256] ;

        for ( int i = 0 ; i < stringHolder.length () ; i++ ) {
            freq[stringHolder.charAt ( i )]++ ;
        }

        System.out.println ( "Character frequencies : " ) ;
        for ( int i = 0 ; i < freq.length ; i++ ) {
            if ( freq[i] > 0 ) {
                System.out.println ( (char) i + " : " + freq[i] ) ;
            }
        }
    }
}

class CharacterFrequencyRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter a string : " ) ;
        String s = input.nextLine () ;

        CharacterFrequency frequency = new CharacterFrequency ( s ) ;
        frequency.findFrequency () ;
        input.close () ;
    }
}
