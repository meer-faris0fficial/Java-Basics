
import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wellcome to the Prime Number calculator.");
        System.out.print("Please entre the Number: ");
        int num = input.nextInt();
        boolean prime = prime(num);
        if (prime){
            System.out.println("the number is prime");
        } else {
            System.out.println("The number is not prime");
        }
        
    }
    public static boolean  prime(int num){
        int i = 2;
        while ( i < num ){
            if (num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }

}
