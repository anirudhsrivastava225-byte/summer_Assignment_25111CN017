package Day_24 ;

import java.util.Scanner ;

public class StringRotation {
    private String s1Holder ;
    private String s2Holder ;

    public StringRotation ( String s1 , String s2 ) {
        this.s1Holder = s1 ;
        this.s2Holder = s2 ;
    }

    public boolean isRotation () {
        if ( s1Holder.length () != s2Holder.length () || s1Holder.isEmpty () ) {
            return false ;
        }
        String concatenated = s1Holder + s1Holder ;
        return concatenated.contains ( s2Holder ) ;
    }
}

class StringRotationRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter first string : " ) ;
        String s1 = input.nextLine () ;
        System.out.print ( "Enter second string : " ) ;
        String s2 = input.nextLine () ;

        StringRotation checker = new StringRotation ( s1 , s2 ) ;
        if ( checker.isRotation () ) {
            System.out.println ( s2 + " is a rotation of " + s1 ) ;
        } else {
            System.out.println ( s2 + " is not a rotation of " + s1 ) ;
        }
        input.close () ;
    }
}
