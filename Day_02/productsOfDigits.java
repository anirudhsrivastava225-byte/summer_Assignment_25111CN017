package Day_2;
import java.util.*;
public class productsOfDigits {
    public static void main (String[] args) {
        Scanner input = new Scanner( System.in ) ;
        System.out.println( " Enter a number: ") ;
        long n = input.nextLong() ;
        long num = n ;
        long pro = 1 ;
        for ( int i = 0 ; n > 0 ; i++ ){
            long rem = n % 10 ;
            pro = pro * rem ;
            n /= 10 ;
        }
        System.out.println(" The product of the digits of the number " + num + " is " + pro ) ;
    }
}