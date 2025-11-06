
import java.util.Scanner;

public class ReverseOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wellcome to the digit reversal.");
        System.out.print("Entre the number: ");
        int num = input.nextInt();
        int reverse = reverse(num);
        System.out.println("reverse of the number is: " + reverse);

    }
    public static int reverse(int num){
        int newNum = 0;// it stores the new reverse number
        while (num > 0){ // the loopruns till num greater than zero
            int digit = num % 10; // it will give the last number of the input number
            newNum = newNum * 10 + digit;// the remainder from the digit is then multiply by 10 as(9*10= 90) and then add the further remainder in it (as 90 + 4= 94) so the reverse will be possible
            num /= 10; // it is for the continous of the loop
        }
        return newNum;
    }
}
