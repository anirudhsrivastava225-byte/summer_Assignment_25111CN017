package Day_5;
import java.util.Scanner ;
public class LargestPrimeFactor {
    private int number ;
     LargestPrimeFactor ( int n ) {
        this.number = n ;
    }
    public int primeExtractor () {
         if ( number == 0 ) return 0 ;
         if ( number == 1 ) return 1 ;
         int reqFactor = 0 ;
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
          while ( number % 2 == 0 ) {
              number /= 2 ;
          }
          for ( int i = 3 ; i < Math.sqrt(number) ; i+= 2 ) {
              while ( number % i == 0 ){
                  number /= i ;
                  reqFactor = number ;
              }
          }
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
