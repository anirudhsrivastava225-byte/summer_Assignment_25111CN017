package Day_26 ;

import java.util.Scanner ;
import java.util.Random ;

public class NumberGuessingGame {
    private int targetHolder ;
    private int attemptsHolder ;

    public NumberGuessingGame () {
        Random rand = new Random () ;
        this.targetHolder = rand.nextInt ( 100 ) + 1 ;
        this.attemptsHolder = 0 ;
    }

    public void play () {
        Scanner input = new Scanner ( System.in ) ;
        int guess = 0 ;

        System.out.println ( "I have picked a number between 1 and 100. Try to guess it!" ) ;

        while ( guess != targetHolder ) {
            System.out.print ( "Enter your guess : " ) ;
            guess = input.nextInt () ;
            attemptsHolder++ ;

            if ( guess < targetHolder ) {
                System.out.println ( "Too low! Try again." ) ;
            } else if ( guess > targetHolder ) {
                System.out.println ( "Too high! Try again." ) ;
            } else {
                System.out.println ( "Congratulations! You guessed it in " + attemptsHolder + " attempts." ) ;
            }
        }
    }
}

class NumberGuessingGameRunner {
    public static void main ( String[] args ) {
        NumberGuessingGame game = new NumberGuessingGame () ;
        game.play () ;
    }
}
