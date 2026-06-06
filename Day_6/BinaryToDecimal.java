package Day_6;
import java.util.Scanner;
public class BinaryToDecimal {
    private String binHolder ;
    StringBuilder complete = new StringBuilder () ;
    public BinaryToDecimal ( String a ) {
        this.binHolder = a ;
    }
    public StringBuilder primaryManager () {
        StringBuilder decPart = new StringBuilder () ;
        if ( binHolder.startsWith( "-" ) ) {
            complete.append("-");
            binHolder = binHolder.substring(1);
        }
        String[] parts = binHolder.split("\\.");
        decPart.append( parts[0] ) ;
        wholeConvert ( decPart.reverse() ) ;
        if ( parts.length == 1 ) return complete ;

        StringBuilder fracPart = new StringBuilder () ;
        fracPart.append( parts[1] ) ;
        complete.append( ".") ;
        fracConvert ( fracPart ) ;
        return complete ;
    }
    public void wholeConvert ( StringBuilder x ) {
        int sum = 0 ;
        for ( int i = 0 ; i < x.length() ; i++ ) {
          int n = x.charAt(i) - '0' ;
          sum += n * ( (int) Math.pow( 2,i ) ) ;
        }
        complete.append( sum ) ;
    }
    public void fracConvert ( StringBuilder y ) {
        double sum = 0 ;
        for ( int i = 0 ; i < y.length() ; i++ ) {
            int n = y.charAt(i) - '0' ;
            sum += n * ( Math.pow( 2,-( i + 1 ))) ;
        }
        String fractionDigits = String.valueOf(sum).substring(2);
        complete.append(fractionDigits);}
}
class BinaryToDecimalRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter a Binary number : " ) ;
        String x = input.nextLine() ;
        BinaryToDecimal num = new BinaryToDecimal ( x ) ;
        System.out.println( "The Binary number " + x + " converted to Decimal is " + num.primaryManager() ) ;
        input.close() ;
    }
}

