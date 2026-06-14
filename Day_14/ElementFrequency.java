package Day_14;

import java.util.Scanner;

public class ElementFrequency {
    private int[] arrayHolder ;
    private int targetHolder ;

    public ElementFrequency ( int[] arr , int target ) {
        this.arrayHolder = arr ;
        this.targetHolder = target ;
    }

    public int countFrequency () {
        int count = 0 ;
        for ( int i = 0 ; i < arrayHolder.length ; i++ ) {
            if ( arrayHolder[i] == targetHolder ) {
                count++ ;
            }
        }
        return count ;
    }
}

class ElementFrequencyRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter the size of the array : " ) ;
        int size = input.nextInt () ;
        int[] arr = new int[size] ;

        System.out.println ( "Enter the elements of the array : " ) ;
        for ( int i = 0 ; i < size ; i++ ) {
            arr[i] = input.nextInt () ;
        }

        System.out.print ( "Enter the element to find frequency : " ) ;
        int target = input.nextInt () ;

        ElementFrequency freq = new ElementFrequency ( arr , target ) ;
        System.out.println ( "Frequency of " + target + " is : " + freq.countFrequency () ) ;

        input.close () ;
    }
}
