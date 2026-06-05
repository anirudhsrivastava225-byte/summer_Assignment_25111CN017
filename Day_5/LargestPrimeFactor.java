package Day_5;
import java.util.Scanner ;
public class LargestPrimeFactor {
    private final int number ;
     LargestPrimeFactor ( int n ) {
        this.number = n ;
    }
    public int primeExtractor () {
         if ( number == 0 ) return 0 ;
         if ( number == 1 ) return 1 ;
         int reqFactor = 0 ;
         int num = number ;
//OLD METHOD
//         for ( int i = 2 ; i <= number ; i++ ) {
//             int notPrimeSignal = 0 ;
//             if ( number % i == 0 ) {
//                 for ( int j = 2 ; j < i ; j++ ) {
//                     if ( i % j == 0 ) notPrimeSignal ++ ;
//                 }
//                 if ( notPrimeSignal == 0 ) {
//                     reqFactor = i  ;
//                 }
//             }
//         }
        //NEW METHOD
          while ( num % 2 == 0 ) {
              num /= 2 ;
              reqFactor = 2 ;
          }
          for ( int i = 3 ; i <= Math.sqrt(num) ; i+= 2 ) {
              while ( num % i == 0 ){
                  num /= i ;
                  reqFactor = i ;
              }
          }
          if ( num > 2 ) reqFactor = num ;
         return (reqFactor) ;
    }
}
class LargestPrimeFactorRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter a number to find it's largest prime factor: ");
        int n = input.nextInt() ;
        LargestPrimeFactor test = new LargestPrimeFactor ( n ) ;
        System.out.println( "The biggest prime factor of " + n + " is : " + test.primeExtractor() );
        input.close();
    }
}
