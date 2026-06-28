package Day_28 ;

import java.util.Scanner ;

public class LibraryManagementSystem {
    private String bookTitleHolder ;
    private String authorHolder ;

    public LibraryManagementSystem ( String title , String author ) {
        this.bookTitleHolder = title ;
        this.authorHolder = author ;
    }

    public void displayBook () {
        System.out.println ( "--- Library Book Details ---" ) ;
        System.out.println ( "Title : " + bookTitleHolder ) ;
        System.out.println ( "Author : " + authorHolder ) ;
    }
}

class LibraryManagementSystemRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;

        System.out.print ( "Enter Book Title : " ) ;
        String title = input.nextLine () ;

        System.out.print ( "Enter Author Name : " ) ;
        String author = input.nextLine () ;

        LibraryManagementSystem library = new LibraryManagementSystem ( title , author ) ;
        library.displayBook () ;

        input.close () ;
    }
}
