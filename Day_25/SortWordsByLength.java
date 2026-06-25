package Day_25 ;

import java.util.Scanner ;

public class SortWordsByLength {
    private String sentenceHolder ;

    public SortWordsByLength ( String sentence ) {
        this.sentenceHolder = sentence ;
    }

    public void sortAndPrint () {
        String[] words = sentenceHolder.split ( "\\s+" ) ;

        for ( int i = 0 ; i < words.length - 1 ; i++ ) {
            for ( int j = i + 1 ; j < words.length ; j++ ) {
                if ( words[i].length () > words[j].length () ) {
                    String temp = words[i] ;
                    words[i] = words[j] ;
                    words[j] = temp ;
                }
            }
        }

        for ( String word : words ) {
            System.out.print ( word + " " ) ;
        }
        System.out.println () ;
    }
}

class SortWordsByLengthRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;

        System.out.print ( "Enter a sentence : " ) ;
        String sentence = input.nextLine () ;

        SortWordsByLength sorter = new SortWordsByLength ( sentence ) ;
        System.out.print ( "Sorted by length : " ) ;
        sorter.sortAndPrint () ;

        input.close () ;
    }
}
