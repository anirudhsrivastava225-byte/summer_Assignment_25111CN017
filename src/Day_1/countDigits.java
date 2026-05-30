import java.util.Scanner;
public class countDigits{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        long n = input.nextLong();
        int count = 0;
        while (n > 0){
            n = n / 10;
            count++;
        }
        System.out.println("The number of digits in the given number is " + count);
    }
}
