package Day_30 ;

import java.util.Scanner ;

public class MiniLibrarySystem {
    private String[] booksHolder ;
    private boolean[] availabilityHolder ;
    private int countHolder ;

    public MiniLibrarySystem ( int capacity ) {
        this.booksHolder = new String[capacity] ;
        this.availabilityHolder = new boolean[capacity] ;
        this.countHolder = 0 ;
    }

    public void addBook ( String title ) {
        if ( countHolder < booksHolder.length ) {
            booksHolder[countHolder] = title ;
            availabilityHolder[countHolder] = true ;
            countHolder++ ;
        }
    }

    public void displayLibrary () {
        System.out.println ( "\n--- Library Inventory ---" ) ;
        for ( int i = 0 ; i < countHolder ; i++ ) {
            String status = availabilityHolder[i] ? "Available" : "Borrowed" ;
            System.out.println ( ( i + 1 ) + ". " + booksHolder[i] + " [" + status + "]" ) ;
        }
    }
}

class MiniLibrarySystemRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter library capacity : " ) ;
        int n = input.nextInt () ;
        input.nextLine () ;

        MiniLibrarySystem library = new MiniLibrarySystem ( n ) ;
        for ( int i = 0 ; i < n ; i++ ) {
            System.out.print ( "Enter book title " + ( i + 1 ) + " : " ) ;
            String title = input.nextLine () ;
            library.addBook ( title ) ;
        }

        library.displayLibrary () ;
        input.close () ;
    }
}
