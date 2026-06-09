package Day_9 ;

import java.util.Scanner ;

public class HollowSquarePattern {
    private int sizeHolder ;

    public HollowSquarePattern ( int a ) {
        this.sizeHolder = a ;
    }

    public String primaryManager () {
        StringBuilder pattern = new StringBuilder () ;
        pattern.append( "\n" ) ;

        for ( int i = 1 ; i <= sizeHolder ; i++ ) {
            for ( int j = 1 ; j <= sizeHolder ; j++ ) {
                if ( i == 1 || i == sizeHolder || j == 1 || j == sizeHolder ) {
                    pattern.append( "*" ) ;
                } else {
                    pattern.append( " " ) ;
                }
            }
            pattern.append( "\n" ) ;
        }

        return pattern.toString() ;
    }
}

class HollowSquarePatternRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter square size : " ) ;
        int x = input.nextInt() ;
        HollowSquarePattern num = new HollowSquarePattern ( x ) ;
        System.out.println( "The hollow square pattern is : " + num.primaryManager() ) ;
        input.close() ;
    }
}