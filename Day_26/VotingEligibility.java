package Day_26 ;

import java.util.Scanner ;

public class VotingEligibility {
    private int ageHolder ;

    public VotingEligibility ( int age ) {
        this.ageHolder = age ;
    }

    public void checkEligibility () {
        if ( ageHolder >= 18 ) {
            System.out.println ( "You are eligible to vote." ) ;
        } else {
            int yearsLeft = 18 - ageHolder ;
            System.out.println ( "You are not eligible to vote. You can vote after " + yearsLeft + " years." ) ;
        }
    }
}

class VotingEligibilityRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter your age : " ) ;
        int age = input.nextInt () ;

        VotingEligibility system = new VotingEligibility ( age ) ;
        system.checkEligibility () ;

        input.close () ;
    }
}
