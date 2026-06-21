package Day_21 ;

import java.util.Scanner ;

public class LowerToUpperConverter {
    private String strHolder ;

    public LowerToUpperConverter ( String a ) {
        this.strHolder = a ;
    }

    public String primaryManager () {
        StringBuilder result = new StringBuilder () ;

        for ( int i = 0 ; i < strHolder.length() ; i++ ) {
            char ch = strHolder.charAt( i ) ;
            if ( ch >= 'a' && ch <= 'z' ) {
                ch = (char) ( ch - 32 ) ;
            }
            result.append( ch ) ;
        }

        return result.toString() ;
    }
}

class LowerToUpperConverterRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter a string : " ) ;
        String x = input.nextLine() ;
        LowerToUpperConverter str = new LowerToUpperConverter ( x ) ;
        System.out.println( "Uppercase string is : " + str.primaryManager() ) ;
        input.close() ;
    }
}

