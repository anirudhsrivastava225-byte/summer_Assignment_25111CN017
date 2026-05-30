import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number to find factorial" );
        long n = input.nextLong();
        long fact = 1;
        for (int i = 1; i <= n; i++){
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
