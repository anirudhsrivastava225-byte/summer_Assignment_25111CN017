package Day_22 ;

import java.util.Scanner ;

public class WordCounter {
    private String sentenceHolder ;

    public WordCounter ( String s ) {
        this.sentenceHolder = s ;
    }

    public int countWords () {
        if ( sentenceHolder == null || sentenceHolder.trim ().isEmpty () ) {
            return 0 ;
        }
        String[] words = sentenceHolder.trim ().split ( "\\s+" ) ;
        return words.length ;
    }
}

class WordCounterRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter a sentence : " ) ;
        String s = input.nextLine () ;

        WordCounter counter = new WordCounter ( s ) ;
        System.out.println ( "Number of words in the sentence : " + counter.countWords () ) ;
        input.close () ;
    }
}
