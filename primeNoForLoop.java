
import java.util.Scanner;

public class primeNoForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to prime no checker");
        System.out.print("Please enter the number: ");
        int num = input.nextInt();
        boolean isprime = isprime(num);
        System.out.println("Your number is " + (isprime ? "prime" : "not prime"));

    }
    public static boolean isprime(int num){
        for (int i = 2; i < num ; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    } 
}
