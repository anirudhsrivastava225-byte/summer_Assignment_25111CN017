package Day_27 ;

import java.util.Scanner ;

public class MarksheetGenerationSystem {
    private String studentNameHolder ;
    private int[] marksHolder ;

    public MarksheetGenerationSystem ( String name , int[] marks ) {
        this.studentNameHolder = name ;
        this.marksHolder = marks ;
    }

    public void generateMarksheet () {
        int total = 0 ;
        System.out.println ( "--- Marksheet ---" ) ;
        System.out.println ( "Student : " + studentNameHolder ) ;
        for ( int i = 0 ; i < marksHolder.length ; i++ ) {
            System.out.println ( "Subject " + ( i + 1 ) + " : " + marksHolder[i] ) ;
            total += marksHolder[i] ;
        }
        double percentage = (double) total / marksHolder.length ;
        System.out.println ( "Total Marks : " + total ) ;
        System.out.println ( "Percentage : " + percentage + "%" ) ;
    }
}

class MarksheetGenerationSystemRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;

        System.out.print ( "Enter Student Name : " ) ;
        String name = input.nextLine () ;

        System.out.print ( "Enter number of subjects : " ) ;
        int n = input.nextInt () ;
        int[] marks = new int[n] ;

        for ( int i = 0 ; i < n ; i++ ) {
            System.out.print ( "Enter marks for Subject " + ( i + 1 ) + " : " ) ;
            marks[i] = input.nextInt () ;
        }

        MarksheetGenerationSystem marksheet = new MarksheetGenerationSystem ( name , marks ) ;
        marksheet.generateMarksheet () ;

        input.close () ;
    }
}
