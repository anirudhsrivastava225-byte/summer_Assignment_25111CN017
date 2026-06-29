package Day_29 ;

import java.util.Scanner ;

public class InventoryManagementSystem {
    private String itemNameHolder ;
    private double priceHolder ;
    private int quantityHolder ;

    public InventoryManagementSystem ( String name , double price , int qty ) {
        this.itemNameHolder = name ;
        this.priceHolder = price ;
        this.quantityHolder = qty ;
    }

    public double calculateTotalValue () {
        return priceHolder * quantityHolder ;
    }

    public void displayItem () {
        System.out.println ( "--- Inventory Item Details ---" ) ;
        System.out.println ( "Item Name : " + itemNameHolder ) ;
        System.out.println ( "Price per Unit : " + priceHolder ) ;
        System.out.println ( "Quantity : " + quantityHolder ) ;
        System.out.println ( "Total Value : " + calculateTotalValue () ) ;
    }
}

class InventoryManagementSystemRunner {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in ) ;

        System.out.print ( "Enter Item Name : " ) ;
        String name = input.nextLine () ;

        System.out.print ( "Enter Price : " ) ;
        double price = input.nextDouble () ;

        System.out.print ( "Enter Quantity : " ) ;
        int qty = input.nextInt () ;

        InventoryManagementSystem item = new InventoryManagementSystem ( name , price , qty ) ;
        item.displayItem () ;

        input.close () ;
    }
}
