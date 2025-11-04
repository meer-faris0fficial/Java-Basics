
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wellcome to the factorial calculator");
        System.out.print("Please entre your number: ");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("factorial is " + fact );

    }
  // we use long for the factorial as the value of the factorial became very large and donot fit in the int 
    public static long factorial(int num){
        if (num < 2){ // it is for the factorial of zero and one 
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i <= num){
            fact *= i;
            i++;
        }
        return fact;
    }
}
