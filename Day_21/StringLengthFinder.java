package Day_21 ;

import java.util.Scanner ;

public class StringLengthFinder {
    private String strHolder ;

    public StringLengthFinder ( String a ) {
        this.strHolder = a ;
    }

    public int primaryManager () {
        int count = 0 ;
        for ( char c : strHolder.toCharArray() ) {
            count++ ;
        }
        return count ;
    }
}

class StringLengthFinderRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter a string : " ) ;
        String x = input.nextLine() ;
        StringLengthFinder str = new StringLengthFinder ( x ) ;
        System.out.println( "Length of the string is : " + str.primaryManager() ) ;
        input.close() ;
    }
}

