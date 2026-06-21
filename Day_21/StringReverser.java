package Day_21 ;

import java.util.Scanner ;

public class StringReverser {
    private String strHolder ;

    public StringReverser ( String a ) {
        this.strHolder = a ;
    }

    public String primaryManager () {
        StringBuilder reversed = new StringBuilder () ;
        for ( int i = strHolder.length() - 1 ; i >= 0 ; i-- ) {
            reversed.append( strHolder.charAt( i ) ) ;
        }
        return reversed.toString() ;
    }
}

class StringReverserRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter a string : " ) ;
        String x = input.nextLine() ;
        StringReverser str = new StringReverser ( x ) ;
        System.out.println( "Reversed string is : " + str.primaryManager() ) ;
        input.close() ;
    }
}
