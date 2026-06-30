package Day_30 ;

import java.util.Scanner ;

public class CompleteMiniProject {
    private String[] tasksHolder ;
    private String[] statusHolder ;
    private int countHolder ;

    public CompleteMiniProject ( int capacity ) {
        this.tasksHolder = new String[capacity] ;
        this.statusHolder = new String[capacity] ;
        this.countHolder = 0 ;
    }

    public void addTask ( String task ) {
        if ( countHolder < tasksHolder.length ) {
            tasksHolder[countHolder] = task ;
            statusHolder[countHolder] = "Pending" ;
            countHolder++ ;
            System.out.println ( "Task added successfully." ) ;
        } else {
            System.out.println ( "Task list is full." ) ;
        }
    }

    public void updateStatus ( int index , String status ) {
        if ( index >= 0 && index < countHolder ) {
            statusHolder[index] = status ;
            System.out.println ( "Status updated." ) ;
        } else {
            System.out.println ( "Invalid task index." ) ;
        }
    }

    public void displayTasks () {
        System.out.println ( "\n--- Task List ---" ) ;
        for ( int i = 0 ; i < countHolder ; i++ ) {
            System.out.println ( ( i + 1 ) + ". " + tasksHolder[i] + " [" + statusHolder[i] + "]" ) ;
        }
    }
}

class CompleteMiniProjectRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;
        System.out.print ( "Enter task capacity : " ) ;
        int n = input.nextInt () ;
        input.nextLine () ;

        CompleteMiniProject project = new CompleteMiniProject ( n ) ;
        int choice ;

        do {
            System.out.println ( "\n1. Add Task\n2. Update Status\n3. Display Tasks\n4. Exit" ) ;
            System.out.print ( "Enter choice : " ) ;
            choice = input.nextInt () ;
            input.nextLine () ;

            switch ( choice ) {
                case 1 :
                    System.out.print ( "Enter task description : " ) ;
                    String desc = input.nextLine () ;
                    project.addTask ( desc ) ;
                    break ;
                case 2 :
                    System.out.print ( "Enter task number to update : " ) ;
                    int idx = input.nextInt () - 1 ;
                    input.nextLine () ;
                    System.out.print ( "Enter new status : " ) ;
                    String status = input.nextLine () ;
                    project.updateStatus ( idx , status ) ;
                    break ;
                case 3 :
                    project.displayTasks () ;
                    break ;
            }
        } while ( choice != 4 ) ;

        input.close () ;
    }
}
