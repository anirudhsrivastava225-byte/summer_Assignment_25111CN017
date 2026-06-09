package Day_9 ;
import java.util.Scanner ;
public class ReverseStarPattern {
    private int rowsHolder ;

    public ReverseStarPattern ( int a ) {
        this.rowsHolder = a ;
    }

    public String primaryManager () {
        StringBuilder pattern = new StringBuilder () ;
        pattern.append( "\n" ) ;

        for ( int i = rowsHolder ; i >= 1 ; i-- ) {
            for ( int j = 1 ; j <= i ; j++ ) {
                pattern.append( "*" ) ;
            }
            pattern.append( "\n" ) ;
        }

        return pattern.toString() ;
    }
}

class ReverseStarPatternRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter number of rows : " ) ;
        int x = input.nextInt() ;
        ReverseStarPattern num = new ReverseStarPattern ( x ) ;
        System.out.println( "The reverse star pattern is : " + num.primaryManager() ) ;
        input.close() ;
    }
}