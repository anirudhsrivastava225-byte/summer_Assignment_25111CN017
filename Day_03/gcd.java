package Day_3;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( " Enter the greator number: " ) ;
        int a = input.nextInt() ;
        System.out.println( " " ) ;
        System.out.print( " Enter the smaller number: " ) ;
        int b = input.nextInt() ;
        System.out.println( " " ) ;
        while ( b > 0 ) {
            int temp = b ;
            b = a % b ;
            a = temp ;
        }
        System.out.println( " The GCD is " + a ) ;
    }
}
