package Day_05;
import java.util.List ;
import java.util.ArrayList ;
import java.util.Scanner ;
public class Factors {
    private final int number ;
     public Factors ( int n ) {
        this.number = n ;
    }
    public List <Integer> extractFactor () {
        final List < Integer > inventory = new ArrayList <> ( ) ;
        for ( int i = 1 ; i <= Math.sqrt( number ) ; i++ ) {
            if ( number % i == 0 ) inventory.add(i) ;
        }
        inventory.add( number ) ;
        return inventory ;
    }
}
class FactorsRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        int j = 0 ;
        System.out.println( "Enter the number to calculate the factors: " ) ;
        int n = input.nextInt() ;
        Factors test = new Factors ( n ) ;
        List < Integer > storage = test.extractFactor() ;
        System.out.println( "The factors of " + n + " are: ");
        for ( Integer num : storage ) {
            System.out.print( num );
            j ++ ;
            if ( j != storage.size()) System.out.print(",");
            if ( j == storage.size()) System.out.print(".");
        }
        input.close() ;
    }
}
