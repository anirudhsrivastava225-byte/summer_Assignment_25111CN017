package Day_23 ;

import java.util.Scanner ;
import java.util.Arrays ;

public class CheckAnagram {
    private String firstHolder ;
    private String secondHolder ;

    public CheckAnagram ( String s1 , String s2 ) {
        this.firstHolder = s1 ;
        this.secondHolder = s2 ;
    }

    public boolean isAnagram () {
        String s1 = firstHolder.replaceAll ( "\\s" , "" ) .toLowerCase () ;
        String s2 = secondHolder.replaceAll ( "\\s" , "" ) .toLowerCase () ;

        if ( s1.length () != s2.length () ) {
            return false ;
        }

        char[] charArray1 = s1.toCharArray () ;
        char[] charArray2 = s2.toCharArray () ;

        Arrays.sort ( charArray1 ) ;
        Arrays.sort ( charArray2 ) ;

        return Arrays.equals ( charArray1 , charArray2 ) ;
    }
}

class CheckAnagramRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter first string : " ) ;
        String s1 = input.nextLine () ;
        System.out.print ( "Enter second string : " ) ;
        String s2 = input.nextLine () ;

        CheckAnagram checker = new CheckAnagram ( s1 , s2 ) ;
        if ( checker.isAnagram () ) {
            System.out.println ( "\"" + s1 + "\" and \"" + s2 + "\" are anagrams." ) ;
        } else {
            System.out.println ( "\"" + s1 + "\" and \"" + s2 + "\" are not anagrams." ) ;
        }
        input.close () ;
    }
}
