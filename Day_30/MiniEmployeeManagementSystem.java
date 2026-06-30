package Day_30 ;

import java.util.Scanner ;

public class MiniEmployeeManagementSystem {
    private String[] employeeNamesHolder ;
    private String[] designationsHolder ;
    private int countHolder ;

    public MiniEmployeeManagementSystem ( int capacity ) {
        this.employeeNamesHolder = new String[capacity] ;
        this.designationsHolder = new String[capacity] ;
        this.countHolder = 0 ;
    }

    public void addEmployee ( String name , String designation ) {
        if ( countHolder < employeeNamesHolder.length ) {
            employeeNamesHolder[countHolder] = name ;
            designationsHolder[countHolder] = designation ;
            countHolder++ ;
        }
    }

    public void displayEmployees () {
        System.out.println ( "\n--- Employee Records ---" ) ;
        for ( int i = 0 ; i < countHolder ; i++ ) {
            System.out.println ( "Name : " + employeeNamesHolder[i] + " | Designation : " + designationsHolder[i] ) ;
        }
    }
}

class MiniEmployeeManagementSystemRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter max employees : " ) ;
        int n = input.nextInt () ;
        input.nextLine () ;

        MiniEmployeeManagementSystem system = new MiniEmployeeManagementSystem ( n ) ;
        for ( int i = 0 ; i < n ; i++ ) {
            System.out.print ( "Enter name for employee " + ( i + 1 ) + " : " ) ;
            String name = input.nextLine () ;
            System.out.print ( "Enter designation : " ) ;
            String desig = input.nextLine () ;
            system.addEmployee ( name , desig ) ;
        }

        system.displayEmployees () ;
        input.close () ;
    }
}
