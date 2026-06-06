package Day_6 ;

import java.util.Scanner ;

public class SetBitsCounter {
    private int numHolder ;

    public SetBitsCounter ( int a ) {
        this.numHolder = a ;
    }

    public int primaryManager () {
        int count = 0 ;
        int temp = Math.abs( numHolder ) ;

        while( temp > 0 ) {
            int rem = temp % 2 ;
            if ( rem == 1 ) count++ ;
            temp /= 2 ;
        }

        return count ;
    }
}

class SetBitsCounterRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print( "Enter a number : " ) ;
        int x = input.nextInt() ;
        SetBitsCounter num = new SetBitsCounter ( x ) ;
        System.out.println( "The number of set bits in " + x + " is " + num.primaryManager() ) ;
        input.close() ;
    }
}
