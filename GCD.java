
import java.util.Scanner;
// gcd is a highest no on which two no can be divided
public class GCD { //gcd is a greatest common diviser 
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("wellcome to the GCD calculator.");
        System.out.print("Entre the first number: ");
        int first = input.nextInt();
        System.out.print("Entre the second number: ");
        int second = input.nextInt();
        int gcd = gcd(first, second);
        System.out.println("GCD of the numbers is: " + gcd);

    }
    public static int gcd(int num1,int num2){
        int gcd = 1;
        int i = 2;
        int least = least(num1, num2);// it is use to stop the loop
        while (i <= least){  // here the function least is used to call the smallest number till the loop runs
            if (num1 % i == 0 && num2 % i == 0){ //here num1 and num2 are from the gcd function not from the least function
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int num1,int num2){
        if (num1 < num2){
            return num1;
        } else {
            return num2;
        }
    }
}
