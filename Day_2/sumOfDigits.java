import java.util.*;
public class sumOfDigits {
    public static void main (String[] args) {
        Scanner input = new Scanner( System.in ) ;
        System.out.println( " Enter a number: ") ;
        long n = input.nextLong() ;
        long num = n ;
        long sum = 0 ;
        for ( int i = 0 ; n > 0 ; i++ ){
            long rem = n % 10 ;
            sum = sum + rem ;
            n /= 10 ;
        }
        System.out.println(" The sum of the digits of the number " + num + " is " + sum ) ;
    }
}