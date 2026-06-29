package Day_29 ;

import java.util.Scanner ;

public class MenuDrivenStringOperations {
    private String stringHolder ;

    public MenuDrivenStringOperations ( String s ) {
        this.stringHolder = s ;
    }

    public String reverse () {
        return new StringBuilder ( stringHolder ) .reverse () .toString () ;
    }

    public String toUpper () {
        return stringHolder.toUpperCase () ;
    }

    public String toLower () {
        return stringHolder.toLowerCase () ;
    }

    public int getLength () {
        return stringHolder.length () ;
    }
}

class MenuDrivenStringOperationsRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        int choice ;

        do {
            System.out.println ( "\n--- String Operations Menu ---" ) ;
            System.out.println ( "1. Reverse\n2. To UpperCase\n3. To LowerCase\n4. Get Length\n5. Exit" ) ;
            System.out.print ( "Enter your choice : " ) ;
            choice = input.nextInt () ;
            input.nextLine () ;

            if ( choice >= 1 && choice <= 4 ) {
                System.out.print ( "Enter the string : " ) ;
                String s = input.nextLine () ;
                MenuDrivenStringOperations ops = new MenuDrivenStringOperations ( s ) ;

                switch ( choice ) {
                    case 1 : System.out.println ( "Result : " + ops.reverse () ) ; break ;
                    case 2 : System.out.println ( "Result : " + ops.toUpper () ) ; break ;
                    case 3 : System.out.println ( "Result : " + ops.toLower () ) ; break ;
                    case 4 : System.out.println ( "Result : " + ops.getLength () ) ; break ;
                }
            }
        } while ( choice != 5 ) ;
        input.close () ;
    }
}
