
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("wellcome to the fibonacci series.");
        System.out.print("Please entre the number till series should be printed: ");
        int num = input.nextInt();
        System.out.println("The fibonacci series till the number is: ");
        fibonaci(num);

    }
    public static void fibonaci(int num){
        if (num < 0) return;
       System.out.print("0 ");
        if (num == 0) return;
        System.out.print("1 ");
        // fibonacci series is 0 1 1 2 3 5 8 13 21 34 55 89 .........
        int first = 0, second = 1;
        while (first + second <= num){
            int third = first + second; 
            System.out.print(third + " "); // print space after the number is being printed 
            first = second;  
            second = third;
        }
    }
}
