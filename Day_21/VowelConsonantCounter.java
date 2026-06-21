package Day_21 ;

import java.util.Scanner ;

public class VowelConsonantCounter {
    private String strHolder ;

    public VowelConsonantCounter ( String a ) {
        this.strHolder = a ;
    }

    public String primaryManager () {
        int vowels = 0 ;
        int consonants = 0 ;
        String lowerStr = strHolder.toLowerCase() ;

        for ( int i = 0 ; i < lowerStr.length() ; i++ ) {
            char ch = lowerStr.charAt( i ) ;
            if ( ch >= 'a' && ch <= 'z' ) {
                if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                    vowels++ ;
                } else {
                    conसरणants++ ;
                }
            }
        }

        return "Vowels = " + vowels + ", Consonants = " + consonants ;
    }
}

class VowelConsonantCounterRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter a string : " ) ;
        String x = input.nextLine() ;
        VowelConsonantCounter str = new VowelConsonantCounter ( x ) ;
        System.out.println( str.primaryManager() ) ;
        input.close() ;
    }
}

