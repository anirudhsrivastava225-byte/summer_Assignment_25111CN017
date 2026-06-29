package Day_29 ;

import java.util.Scanner ;

public class MenuDrivenCalculator {
    private double firstHolder ;
    private double secondHolder ;

    public MenuDrivenCalculator ( double a , double b ) {
        this.firstHolder = a ;
        this.secondHolder = b ;
    }

    public double add () {
        return firstHolder + secondHolder ;
    }

    public double subtract () {
        return firstHolder - secondHolder ;
    }

    public double multiply () {
        return firstHolder * secondHolder ;
    }

    public double divide () {
        if ( secondHolder == 0 ) {
            System.out.println ( "Error! Division by zero." ) ;
            return 0 ;
        }
        return firstHolder / secondHolder ;
    }
}

class MenuDrivenCalculatorRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        int choice ;

        do {
            System.out.println ( "\n--- Calculator Menu ---" ) ;
            System.out.println ( "1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit" ) ;
            System.out.print ( "Enter your choice : " ) ;
            choice = input.nextInt () ;

            if ( choice >= 1 && choice <= 4 ) {
                System.out.print ( "Enter first number : " ) ;
                double num1 = input.nextDouble () ;
                System.out.print ( "Enter second number : " ) ;
                double num2 = input.nextDouble () ;

                MenuDrivenCalculator calc = new MenuDrivenCalculator ( num1 , num2 ) ;

                switch ( choice ) {
                    case 1 : System.out.println ( "Result : " + calc.add () ) ; break ;
                    case 2 : System.out.println ( "Result : " + calc.subtract () ) ; break ;
                    case 3 : System.out.println ( "Result : " + calc.multiply () ) ; break ;
                    case 4 : System.out.println ( "Result : " + calc.divide () ) ; break ;
                }
            }
        } while ( choice != 5 ) ;

        input.close () ;
    }
}
