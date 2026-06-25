package Day_25 ;

import java.util.Scanner ;
import java.util.Arrays ;

public class SortNamesAlphabetically {
    private String[] namesHolder ;

    public SortNamesAlphabetically ( String[] names ) {
        this.namesHolder = names ;
    }

    public void sort () {
        for ( int i = 0 ; i < namesHolder.length - 1 ; i++ ) {
            for ( int j = i + 1 ; j < namesHolder.length ; j++ ) {
                if ( namesHolder[i].compareToIgnoreCase ( namesHolder[j] ) > 0 ) {
                    String temp = namesHolder[i] ;
                    namesHolder[i] = namesHolder[j] ;
                    namesHolder[j] = temp ;
                }
            }
        }
    }

    public void printNames () {
        for ( String name : namesHolder ) {
            System.out.println ( name ) ;
        }
    }
}

class SortNamesAlphabeticallyRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;

        System.out.print ( "Enter number of names : " ) ;
        int n = input.nextInt () ;
        input.nextLine () ;
        String[] names = new String[n] ;

        System.out.println ( "Enter the names : " ) ;
        for ( int i = 0 ; i < n ; i++ ) {
            names[i] = input.nextLine () ;
        }

        SortNamesAlphabetically sorter = new SortNamesAlphabetically ( names ) ;
        sorter.sort () ;

        System.out.println ( "\nSorted Names : " ) ;
        sorter.printNames () ;

        input.close () ;
    }
}
