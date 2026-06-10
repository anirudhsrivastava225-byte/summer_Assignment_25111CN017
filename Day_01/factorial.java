package Day_01;
import java.util.*;

public class factorial {
  public static void main (String [] args){
    Scanner input = new Scanner(System.in) ;
    System.out.println ("Enter a number: ") ;
    int n = input.nextInt() ;
    int fact = 1 ;
    for ( int i = 1 ; i <= n ; i++ ){
      fact = fact * i ;
    }
    System.out.println ( " The factorial of " + n + " is " + fact ) ;
  }
}
