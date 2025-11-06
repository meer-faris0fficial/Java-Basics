
import java.util.Scanner;

public class SumOfTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wellcome to the sum of the digits");
        System.out.print("Entre the number: ");
        int num = input.nextInt();
        int dig = digits(num);
        System.out.println("The sum of digits is: " + dig);

    }

    public static int digits(int num){
        int sum = 0;
        while (num > 0){
            sum = sum + (num % 10);
            num /= 10;

        }
        return sum;
    }
}
