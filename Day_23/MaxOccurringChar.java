package Day_23 ;

import java.util.Scanner ;

public class MaxOccurringChar {
    private String stringHolder ;

    public MaxOccurringChar ( String s ) {
        this.stringHolder = s ;
    }

    public char findMaxOccurring () {
        int[] freq = new int[256] ;
        int max = -1 ;
        char result = ' ' ;

        for ( int i = 0 ; i < stringHolder.length () ; i++ ) {
            freq[stringHolder.charAt ( i )]++ ;
        }

        for ( int i = 0 ; i < stringHolder.length () ; i++ ) {
            if ( max < freq[stringHolder.charAt ( i )] ) {
                max = freq[stringHolder.charAt ( i )] ;
                result = stringHolder.charAt ( i ) ;
            }
        }
        return result ;
    }
}

class MaxOccurringCharRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter a string : " ) ;
        String s = input.nextLine () ;

        MaxOccurringChar finder = new MaxOccurringChar ( s ) ;
        char result = finder.findMaxOccurring () ;

        System.out.println ( "The maximum occurring character is : " + result ) ;
        input.close () ;
    }
}
