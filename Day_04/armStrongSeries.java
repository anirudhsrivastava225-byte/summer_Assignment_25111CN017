package Day_04;
import java.util.* ;
public class armStrongSeries{
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( " Enter the first number: " ) ;
        int a = input.nextInt () ;
        System.out.println( " " ) ;
        System.out.print ( " Enter the last number: " ) ;
        int b = input.nextInt () ;
        System.out.println( " " ) ;
        // 1. Capture the start time
        long startTime = System.currentTimeMillis();

        // 2. Run the checker method and store the result
        List<Integer> result = checker(a, b);

        // 3. Capture the end time
        long endTime = System.currentTimeMillis();

        // 4. Calculate total time and print everything
        long totalTime = endTime - startTime;

        System.out.println("The Armstrong numbers ranging from " + a + " to " + b + " is: " + result);
        System.out.println("Time taken to calculate: " + totalTime + " milliseconds");
    }
    public static List < Integer > checker ( Integer x , Integer y ) {
        List < Integer > series = new ArrayList <> () ;
        for ( int i = x ; i <= y ; i++ ) {
            List < Integer > container = new ArrayList <> () ;
            int copy = i ;
            int count = 0 ;
            int num = 0 ;
            while ( copy > 0 ) {
                int rem = copy % 10;
                container.add(rem);
                copy = copy / 10;
                count++;
            }
            for ( Integer n : container ) {
                num += (int) Math.pow ( n , count );
            }
            if ( num == i ) series.add ( num ) ;
        }
        return ( series ) ;

    }
}
