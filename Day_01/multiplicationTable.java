package Day_1;
import java.util.Scanner;
public class multiplicationTable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number for which you want to find the multiplication table");
        long number = input.nextLong();
        long pro = 1;
        for ( int i = 1; i <= 10; i++){
            pro = number * i;
            System.out.println(number + " * " + i + " = " + pro);
        }
    }
}
