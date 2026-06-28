package Day_28 ;

import java.util.Scanner ;

public class BankAccountSystem {
    private String accountNumberHolder ;
    private double balanceHolder ;

    public BankAccountSystem ( String accNum , double initialBalance ) {
        this.accountNumberHolder = accNum ;
        this.balanceHolder = initialBalance ;
    }

    public void deposit ( double amount ) {
        if ( amount > 0 ) {
            balanceHolder += amount ;
            System.out.println ( "Successfully deposited : " + amount ) ;
        }
    }

    public void withdraw ( double amount ) {
        if ( amount > 0 && amount <= balanceHolder ) {
            balanceHolder -= amount ;
            System.out.println ( "Successfully withdrew : " + amount ) ;
        } else {
            System.out.println ( "Insufficient balance or invalid amount." ) ;
        }
    }

    public void displayAccountInfo () {
        System.out.println ( "--- Account Details ---" ) ;
        System.out.println ( "Account Number : " + accountNumberHolder ) ;
        System.out.println ( "Current Balance : " + balanceHolder ) ;
    }
}

class BankAccountSystemRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;

        System.out.print ( "Enter Account Number : " ) ;
        String accNum = input.nextLine () ;

        System.out.print ( "Enter Initial Balance : " ) ;
        double balance = input.nextDouble () ;

        BankAccountSystem account = new BankAccountSystem ( accNum , balance ) ;

        System.out.print ( "Enter amount to deposit : " ) ;
        double dep = input.nextDouble () ;
        account.deposit ( dep ) ;

        System.out.print ( "Enter amount to withdraw : " ) ;
        double wit = input.nextDouble () ;
        account.withdraw ( wit ) ;

        account.displayAccountInfo () ;

        input.close () ;
    }
}
