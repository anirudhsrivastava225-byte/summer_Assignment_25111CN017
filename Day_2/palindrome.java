import java.util.*;
public class Palindrome{
    public static void main( String[] args){
        Scanner input = new Scanner( System.in ) ;
        System.out.println( " Enter a number : " ) ;
        int n = input.nextInt() ;
        int num = n ;
        int newN = 0 ;
        for ( int i = 0 ; n > 0 ; i++ ) {
            int rem = n % 10 ;
            newN += rem ;
            n /= 10 ;
            if ( n > 0){
                newN *= 10 ;
            }
        }
        if ( newN == num ){
        System.out.println ( " The number " + num + " is palindrome " ) ;
        }
        else {
            System.out.println ( " The number " + num + " is not palindrome ") ;
        }
    }
}