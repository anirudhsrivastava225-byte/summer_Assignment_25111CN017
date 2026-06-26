package Day_26 ;

import java.util.Scanner ;

public class ATMSimulation {
    private double balanceHolder ;

    public ATMSimulation ( double initialBalance ) {
        this.balanceHolder = initialBalance ;
    }

    public void deposit ( double amount ) {
        if ( amount > 0 ) {
            balanceHolder += amount ;
            System.out.println ( "Successfully deposited : " + amount ) ;
        } else {
            System.out.println ( "Invalid deposit amount." ) ;
        }
    }

    public void withdraw ( double amount ) {
        if ( amount > 0 && amount <= balanceHolder ) {
            balanceHolder -= amount ;
            System.out.println ( "Successfully withdrew : " + amount ) ;
        } else if ( amount > balanceHolder ) {
            System.out.println ( "Insufficient balance." ) ;
        } else {
            System.out.println ( "Invalid withdrawal amount." ) ;
        }
    }

    public double getBalance () {
        return balanceHolder ;
    }
}

class ATMSimulationRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        ATMSimulation atm = new ATMSimulation ( 1000.0 ) ;
        int choice = 0 ;

        System.out.println ( "--- Welcome to ATM Simulation ---" ) ;
        while ( choice != 4 ) {
            System.out.println ( "\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit" ) ;
            System.out.print ( "Enter your choice : " ) ;
            choice = input.nextInt () ;

            if ( choice == 1 ) {
                System.out.println ( "Current Balance : " + atm.getBalance () ) ;
            } else if ( choice == 2 ) {
                System.out.print ( "Enter amount to deposit : " ) ;
                double amount = input.nextDouble () ;
                atm.deposit ( amount ) ;
            } else if ( choice == 3 ) {
                System.out.print ( "Enter amount to withdraw : " ) ;
                double amount = input.nextDouble () ;
                atm.withdraw ( amount ) ;
            } else if ( choice == 4 ) {
                System.out.println ( "Thank you for using our ATM!" ) ;
            } else {
                System.out.println ( "Invalid choice. Try again." ) ;
            }
        }
        input.close () ;
    }
}
