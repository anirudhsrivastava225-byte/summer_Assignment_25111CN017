package Day_26 ;

import java.util.Scanner ;

public class QuizApplication {
    private String[] questionsHolder ;
    private String[] answersHolder ;
    private int scoreHolder ;

    public QuizApplication ( String[] questions , String[] answers ) {
        this.questionsHolder = questions ;
        this.answersHolder = answers ;
        this.scoreHolder = 0 ;
    }

    public void startQuiz () {
        Scanner input = new Scanner ( System.in ) ;
        for ( int i = 0 ; i < questionsHolder.length ; i++ ) {
            System.out.println ( "\nQuestion " + ( i + 1 ) + " : " + questionsHolder[i] ) ;
            System.out.print ( "Your answer : " ) ;
            String userAnswer = input.nextLine () ;

            if ( userAnswer.equalsIgnoreCase ( answersHolder[i] ) ) {
                System.out.println ( "Correct!" ) ;
                scoreHolder++ ;
            } else {
                System.out.println ( "Wrong. The correct answer was : " + answersHolder[i] ) ;
            }
        }
        System.out.println ( "\nQuiz Finished! Your final score is : " + scoreHolder + " / " + questionsHolder.length ) ;
    }
}

class QuizApplicationRunner {
    public static void main ( String[] args ) {
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "Who wrote 'Romeo and Juliet'?"
        } ;
        String[] answers = {
            "Paris",
            "Mars",
            "William Shakespeare"
        } ;

        QuizApplication quiz = new QuizApplication ( questions , answers ) ;
        quiz.startQuiz () ;
    }
}
