package Day_24 ;

import java.util.Scanner ;

public class LongestWord {
    private String sentenceHolder ;

    public LongestWord ( String s ) {
        this.sentenceHolder = s ;
    }

    public String findLongest () {
        if ( sentenceHolder == null || sentenceHolder.isEmpty () ) {
            return "" ;
        }

        String[] words = sentenceHolder.split ( "\\s+" ) ;
        String longest = "" ;

        for ( String word : words ) {
            if ( word.length () > longest.length () ) {
                longest = word ;
            }
        }
        return longest ;
    }
}

class LongestWordRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter a sentence : " ) ;
        String s = input.nextLine () ;

        LongestWord finder = new LongestWord ( s ) ;
        System.out.println ( "The longest word is : " + finder.findLongest () ) ;
        input.close () ;
    }
}
