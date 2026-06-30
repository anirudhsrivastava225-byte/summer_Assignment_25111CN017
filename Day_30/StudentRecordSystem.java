package Day_30 ;

import java.util.Scanner ;

public class StudentRecordSystem {
    private String[] namesHolder ;
    private int[] rollsHolder ;
    private double[] marksHolder ;
    private int countHolder ;

    public StudentRecordSystem ( int capacity ) {
        this.namesHolder = new String[capacity] ;
        this.rollsHolder = new int[capacity] ;
        this.marksHolder = new double[capacity] ;
        this.countHolder = 0 ;
    }

    public void addStudent ( String name , int roll , double marks ) {
        if ( countHolder < namesHolder.length ) {
            namesHolder[countHolder] = name ;
            rollsHolder[countHolder] = roll ;
            marksHolder[countHolder] = marks ;
            countHolder++ ;
        } else {
            System.out.println ( "System full!" ) ;
        }
    }

    public void displayAll () {
        System.out.println ( "\n--- Student Records ---" ) ;
        for ( int i = 0 ; i < countHolder ; i++ ) {
            System.out.println ( "Roll : " + rollsHolder[i] + " | Name : " + namesHolder[i] + " | Marks : " + marksHolder[i] ) ;
        }
    }
}

class StudentRecordSystemRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter system capacity : " ) ;
        int n = input.nextInt () ;
        StudentRecordSystem system = new StudentRecordSystem ( n ) ;

        for ( int i = 0 ; i < n ; i++ ) {
            input.nextLine () ;
            System.out.print ( "Enter name for student " + ( i + 1 ) + " : " ) ;
            String name = input.nextLine () ;
            System.out.print ( "Enter roll : " ) ;
            int roll = input.nextInt () ;
            System.out.print ( "Enter marks : " ) ;
            double marks = input.nextDouble () ;
            system.addStudent ( name , roll , marks ) ;
        }

        system.displayAll () ;
        input.close () ;
    }
}
