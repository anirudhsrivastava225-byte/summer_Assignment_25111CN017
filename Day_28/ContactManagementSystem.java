package Day_28 ;

import java.util.Scanner ;

public class ContactManagementSystem {
    private String nameHolder ;
    private String phoneHolder ;

    public ContactManagementSystem ( String name , String phone ) {
        this.nameHolder = name ;
        this.phoneHolder = phone ;
    }

    public void displayContact () {
        System.out.println ( "--- Contact Details ---" ) ;
        System.out.println ( "Name : " + nameHolder ) ;
        System.out.println ( "Phone : " + phoneHolder ) ;
    }
}

class ContactManagementSystemRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;

        System.out.print ( "Enter Name : " ) ;
        String name = input.nextLine () ;

        System.out.print ( "Enter Phone Number : " ) ;
        String phone = input.nextLine () ;

        ContactManagementSystem contact = new ContactManagementSystem ( name , phone ) ;
        contact.displayContact () ;

        input.close () ;
    }
}
