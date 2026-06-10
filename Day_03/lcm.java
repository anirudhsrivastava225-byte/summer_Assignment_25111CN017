package Day_03;
import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( " Enter the bigger number: " ) ;
        int a = input.nextInt () ;
        System.out.println( " " ) ;
        System.out.print( " Enter the smaller number: " ) ;
        int b = input.nextInt () ;
        System.out.println( " " ) ;
        int lcm = LCM ( a , b ) ;
        System.out.println( " The LCM of " + a + " and " + b + " is " + lcm ) ;
    }
    public static int LCM ( int p , int q ) {
        p = Math.abs ( p ) ;
        q = Math.abs ( q ) ;
        if ( p == 0 || q == 0 ) return 0 ;
        return ( p * ( q / HCF ( p ,q ) ) ) ;
    }
    public static int HCF ( int l , int m ) {
        while ( m > 0 ) {
            int num = m ;
            m = l % m ;
            l = num ;
        }
        return l ;
    }
}
