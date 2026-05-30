package Day_3;

import java.util.Scanner;

public class primeInRange {
    public static void main ( String [] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( " Enter the first number: " ) ;
        int n = input.nextInt () ;
        System.out.print ( " Enter the last number: " ) ;
        int l = input.nextInt () ;
        int notPrimeSignal = 0 ;
        System.out.println( " The list of prime number ranging from " + n + " to " + l + " is " ) ;
        for ( int i = n ; i <= l ; i ++ ) {
            if ( i == 1 ) {
                notPrimeSignal ++ ;
                continue ;
            }
            for ( int j = 2 ; j < i ; j ++ ) {
                if ( i % j == 0 ) {
                    notPrimeSignal ++;
                }
            }
            if ( notPrimeSignal == 0 ) {
                System.out.println ( i ) ;
            }
            notPrimeSignal = 0 ;
        }
    }

}

