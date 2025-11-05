// Palindrome = 32123 reverse is same as original

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wellcome to the Palendrome number identifier.");
        System.out.print("Entre the number: ");
        int num = input.nextInt();
        boolean ispalendrome = isPalendrome(num);
        if (ispalendrome) {
            System.out.println("The number is palendrome");
        } else {
            System.out.println("The number is not palendrome");
        }
        

    }
    public static boolean isPalendrome(int num){
        int reverse = reverse(num);
        return num == reverse;
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
