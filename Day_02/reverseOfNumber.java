package Day_02;
import java.util.* ;
public class reverseOfNumber {
    public static void main( String[] args){
     Scanner input = new Scanner(System.in);
     System.out.println( " Enter a number: " );
     int n = input.nextInt() ;
     int num = n ;
     int newN = 0 ;
     for ( int i = 0 ; n > 0 ; i++ ){
        int rem = n % 10 ;
        newN = ( newN + rem ) * 10 ;
        n = n / 10 ;
     }
     System.out.println ( " The reverse of " + num + " is " + newN/10);
     
   }
}