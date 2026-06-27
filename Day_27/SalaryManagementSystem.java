package Day_27 ;

import java.util.Scanner ;

public class SalaryManagementSystem {
    private double basicSalaryHolder ;
    private double bonusHolder ;

    public SalaryManagementSystem ( double basic , double bonus ) {
        this.basicSalaryHolder = basic ;
        this.bonusHolder = bonus ;
    }

    public double calculateTotal () {
        return basicSalaryHolder + bonusHolder ;
    }

    public void displaySalaryDetails () {
        System.out.println ( "--- Salary Management ---" ) ;
        System.out.println ( "Basic Salary : " + basicSalaryHolder ) ;
        System.out.println ( "Bonus : " + bonusHolder ) ;
        System.out.println ( "Total Salary : " + calculateTotal () ) ;
    }
}

class SalaryManagementSystemRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;

        System.out.print ( "Enter Basic Salary : " ) ;
        double basic = input.nextDouble () ;

        System.out.print ( "Enter Bonus : " ) ;
        double bonus = input.nextDouble () ;

        SalaryManagementSystem salary = new SalaryManagementSystem ( basic , bonus ) ;
        salary.displaySalaryDetails () ;

        input.close () ;
    }
}
