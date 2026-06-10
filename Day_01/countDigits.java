package Day_01;
import java.util.*;
public class countDigits {
  public static void main (String[] args){
    Scanner input = new Scanner( System.in ) ;
    System.out.println(" Enter a number : ") ;
    int n = input.nextInt() ;
    int count = 0 ;
    int num = n ;
    for (int i = 0 ; n > 0 ; i++ ) {
      n = n / 10;
      count ++ ;
    }
    System.out.println(" The total numbers in the digit " + num + " are " + count);
  }
}
