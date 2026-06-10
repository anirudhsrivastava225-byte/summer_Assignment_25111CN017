package Day_06;
import java.util.Scanner ;
public class DecimalToBinary {
    private double decaStorage ;
    public DecimalToBinary ( double a ) {
        this.decaStorage =  a ;
    }
    public StringBuilder wholeDecConvertBin ( int a ) {
        StringBuilder wholeStorage = new StringBuilder ();
        if ( a == 0 ) return wholeStorage.append (0) ;
        while( a > 0 ) {
            String rem = Integer.toString (a % 2) ;
            wholeStorage.append(rem) ;
            a /= 2 ;
        }
        return wholeStorage.reverse();
    }
    public StringBuilder fractionDecConvertBin (double m ) {
        StringBuilder fractionStorage = new StringBuilder () ;
        int limit = 10 ;
        while ( m > 0 && limit > 0 ) {
            m *= 2 ;
            int Bit = (int) m ;
            fractionStorage.append(Bit) ;
            m -= Bit ;
            limit -- ;
        }
        return fractionStorage ;
    }
    public StringBuilder completeNumber () {
        StringBuilder completeStorage = new StringBuilder () ;
        if ( decaStorage < 0 ) {
            decaStorage = Math.abs(decaStorage) ;
            completeStorage.append( "-" ) ;
        }
        completeStorage.append( wholeDecConvertBin ( (int)decaStorage ) ) ;
        if ( (int)decaStorage - decaStorage == 0 ) {
            return completeStorage ;
        }
        decaStorage -= (int)decaStorage ;
        completeStorage.append(".");
        completeStorage.append(fractionDecConvertBin( decaStorage ) ) ;
        return completeStorage  ;
    }
}
class DecimalToBinaryRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter a decimal number : " ) ;
        double x = input.nextDouble() ;
        DecimalToBinary num = new DecimalToBinary ( x ) ;
        System.out.println( "The Decimal number " + x + " converted to Binary is " + num.completeNumber() ) ;
        input.close() ;
    }
}
