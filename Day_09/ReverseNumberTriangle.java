package Day_09;
import java.util.Scanner ;
public class ReverseNumberTriangle {
    private int rowsHolder ;

    public ReverseNumberTriangle ( int a ) {
        this.rowsHolder = a ;
    }

    public String primaryManager () {
        StringBuilder pattern = new StringBuilder () ;
        pattern.append( "\n" ) ;

        for ( int i = rowsHolder ; i >= 1 ; i-- ) {
            for ( int j = 1 ; j <= i ; j++ ) {
                pattern.append( j ) ;
            }
            pattern.append( "\n" ) ;
        }

        return pattern.toString() ;
    }
}

class ReverseNumberTriangleRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter number of rows : " ) ;
        int x = input.nextInt() ;
        ReverseNumberTriangle num = new ReverseNumberTriangle ( x ) ;
        System.out.println( "The reverse number triangle is : " + num.primaryManager() ) ;
        input.close() ;
    }
}
