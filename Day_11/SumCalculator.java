package Day_11 ;

import java.util.Scanner ;

public class SumCalculator {
    private int num1 ;
    private int num2 ;

    public SumCalculator ( int a, int b ) {
        this.num1 = a ;
        this.num2 = b ;
    }

    public int primaryManager () {
        return findSum ( num1, num2 ) ;
    }

    public int findSum ( int a, int b ) {
        return a + b ;
    }
}

class SumCalculatorRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter first number : " ) ;
        int x = input.nextInt() ;
        System.out.print( "Enter second number : " ) ;
        int y = input.nextInt() ;
        SumCalculator num = new SumCalculator ( x, y ) ;
        System.out.println( "The sum is : " + num.primaryManager() ) ;
        input.close() ;
    }
}