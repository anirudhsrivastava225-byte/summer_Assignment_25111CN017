package Day_29 ;

import java.util.Scanner ;

public class MenuDrivenArrayOperations {
    private int[] arrayHolder ;
    private int sizeHolder ;

    public MenuDrivenArrayOperations ( int capacity ) {
        this.arrayHolder = new int[capacity] ;
        this.sizeHolder = 0 ;
    }

    public void insert ( int element ) {
        if ( sizeHolder < arrayHolder.length ) {
            arrayHolder[sizeHolder] = element ;
            sizeHolder++ ;
            System.out.println ( "Element inserted." ) ;
        } else {
            System.out.println ( "Array is full." ) ;
        }
    }

    public void display () {
        System.out.print ( "Array elements : " ) ;
        for ( int i = 0 ; i < sizeHolder ; i++ ) {
            System.out.print ( arrayHolder[i] + " " ) ;
        }
        System.out.println () ;
    }

    public int search ( int element ) {
        for ( int i = 0 ; i < sizeHolder ; i++ ) {
            if ( arrayHolder[i] == element ) {
                return i ;
            }
        }
        return -1 ;
    }
}

class MenuDrivenArrayOperationsRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        MenuDrivenArrayOperations ops = new MenuDrivenArrayOperations ( 10 ) ;
        int choice ;

        do {
            System.out.println ( "\n--- Array Operations Menu ---" ) ;
            System.out.println ( "1. Insert\n2. Display\n3. Search\n4. Exit" ) ;
            System.out.print ( "Enter your choice : " ) ;
            choice = input.nextInt () ;

            switch ( choice ) {
                case 1 :
                    System.out.print ( "Enter element to insert : " ) ;
                    int elem = input.nextInt () ;
                    ops.insert ( elem ) ;
                    break ;
                case 2 :
                    ops.display () ;
                    break ;
                case 3 :
                    System.out.print ( "Enter element to search : " ) ;
                    int target = input.nextInt () ;
                    int index = ops.search ( target ) ;
                    if ( index != -1 ) System.out.println ( "Found at index : " + index ) ;
                    else System.out.println ( "Not found." ) ;
                    break ;
            }
        } while ( choice != 4 ) ;
        input.close () ;
    }
}
