package Day_25 ;

import java.util.Scanner ;

public class CommonCharacters {
    private String firstHolder ;
    private String secondHolder ;

    public CommonCharacters ( String s1 , String s2 ) {
        this.firstHolder = s1 ;
        this.secondHolder = s2 ;
    }

    public void findCommon () {
        int[] freq1 = new int[256] ;
        int[] freq2 = new int[256] ;

        for ( char c : firstHolder.toCharArray () ) freq1[c]++ ;
        for ( char c : secondHolder.toCharArray () ) freq2[c]++ ;

        System.out.print ( "Common characters : " ) ;
        for ( int i = 0 ; i < 256 ; i++ ) {
            if ( freq1[i] > 0 && freq2[i] > 0 ) {
                System.out.print ( (char) i + " " ) ;
            }
        }
        System.out.println () ;
    }
}

class CommonCharactersRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;

        System.out.print ( "Enter first string : " ) ;
        String s1 = input.nextLine () ;
        System.out.print ( "Enter second string : " ) ;
        String s2 = input.nextLine () ;

        CommonCharacters finder = new CommonCharacters ( s1 , s2 ) ;
        finder.findCommon () ;

        input.close () ;
    }
}
