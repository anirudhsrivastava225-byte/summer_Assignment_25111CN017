package Day_22 ;

import java.util.Scanner ;

public class PalindromeString {
    private String stringHolder ;

    public PalindromeString ( String s ) {
        this.stringHolder = s ;
    }

    public boolean isPalindrome () {
        String cleanString = stringHolder.toLowerCase () ;
        int left = 0 ;
        int right = cleanString.length () - 1 ;

        while ( left < right ) {
            if ( cleanString.charAt ( left ) != cleanString.charAt ( right ) ) {
                return false ;
            }
            left++ ;
            right-- ;
        }
        return true ;
    }
}

class PalindromeStringRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter a string to check : " ) ;
        String s = input.nextLine () ;

        PalindromeString checker = new PalindromeString ( s ) ;
        if ( checker.isPalindrome () ) {
            System.out.println ( "\"" + s + "\" is a palindrome." ) ;
        } else {
            System.out.println ( "\"" + s + "\" is not a palindrome." ) ;
        }
        input.close () ;
    }
}
