package Day_07;
import java.util.Scanner ;

public class RecursiveFactorial {
    private int numHolder ;

    public RecursiveFactorial ( int a ) {
        this.numHolder = a ;
    }

    public long primaryManager () {
        return calculateFactorial ( numHolder ) ;
    }

    public long calculateFactorial ( int n ) {
        if ( n <= 1 ) return 1 ;
        return n * calculateFactorial ( n - 1 ) ;
    }
}

class RecursiveFactorialRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter a number : " ) ;
        int x = input.nextInt() ;
        RecursiveFactorial num = new RecursiveFactorial ( x ) ;
        System.out.println( "The factorial of " + x + " is " + num.primaryManager() ) ;
        input.close() ;
    }
}