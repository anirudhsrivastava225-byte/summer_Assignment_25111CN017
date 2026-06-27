package Day_27 ;

import java.util.Scanner ;

public class StudentRecordSystem {
    private int idHolder ;
    private String nameHolder ;
    private String gradeHolder ;

    public StudentRecordSystem ( int id , String name , String grade ) {
        this.idHolder = id ;
        this.nameHolder = name ;
        this.gradeHolder = grade ;
    }

    public void displayRecord () {
        System.out.println ( "--- Student Record ---" ) ;
        System.out.println ( "ID : " + idHolder ) ;
        System.out.println ( "Name : " + nameHolder ) ;
        System.out.println ( "Grade : " + gradeHolder ) ;
    }
}

class StudentRecordSystemRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;

        System.out.print ( "Enter Student ID : " ) ;
        int id = input.nextInt () ;
        input.nextLine () ;

        System.out.print ( "Enter Student Name : " ) ;
        String name = input.nextLine () ;

        System.out.print ( "Enter Student Grade : " ) ;
        String grade = input.nextLine () ;

        StudentRecordSystem student = new StudentRecordSystem ( id , name , grade ) ;
        student.displayRecord () ;

        input.close () ;
    }
}
