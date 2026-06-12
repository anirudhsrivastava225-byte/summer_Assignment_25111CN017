package Day_12 ;

import java.util.Scanner ;

public class PalindromeChecker {
    private int numHolder ;

    public PalindromeChecker ( int a ) {
        this.numHolder = a ;
    }

    public boolean primaryManager () {
        return checkPalindrome ( numHolder ) ;
    }

    public boolean checkPalindrome ( int n ) {
        if ( n < 0 ) return false ;
        int temp = n ;
        int rev = 0 ;
        while ( temp > 0 ) {
            rev = rev * 10 + ( temp % 10 ) ;
            temp /= 10 ;
        }
        return n == rev ;
    }
}

class PalindromeCheckerRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter a number : " ) ;
        int x = input.nextInt() ;
        PalindromeChecker num = new PalindromeChecker ( x ) ;
        if ( num.primaryManager() ) {
            System.out.println( x + " is a palindrome number." ) ;
        } else {
            System.out.println( x + " is not a palindrome number." ) ;
        }
        input.close() ;
    }
}