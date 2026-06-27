package Day_27 ;

import java.util.Scanner ;

public class EmployeeManagementSystem {
    private int idHolder ;
    private String nameHolder ;
    private String departmentHolder ;

    public EmployeeManagementSystem ( int id , String name , String department ) {
        this.idHolder = id ;
        this.nameHolder = name ;
        this.departmentHolder = department ;
    }

    public void displayEmployee () {
        System.out.println ( "--- Employee Details ---" ) ;
        System.out.println ( "ID : " + idHolder ) ;
        System.out.println ( "Name : " + nameHolder ) ;
        System.out.println ( "Department : " + departmentHolder ) ;
    }
}

class EmployeeManagementSystemRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;

        System.out.print ( "Enter Employee ID : " ) ;
        int id = input.nextInt () ;
        input.nextLine () ;

        System.out.print ( "Enter Employee Name : " ) ;
        String name = input.nextLine () ;

        System.out.print ( "Enter Department : " ) ;
        String dept = input.nextLine () ;

        EmployeeManagementSystem emp = new EmployeeManagementSystem ( id , name , dept ) ;
        emp.displayEmployee () ;

        input.close () ;
    }
}
