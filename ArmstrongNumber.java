// armstrong number = 153 = total digits 3 raise to the power = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("wellcome to the Armstrong Number Finder.");
        System.out.print("Please entre the number: ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        // System.out.println(isArmstrong); // java debugger
        if (isArmstrong){
            System.out.println("Your number is Armstrong");
        } else {
            System.out.println("Your number is not Armstrong");
        }
    }
    public static boolean isArmstrong(int num){
        int NumOfDigits = noOfDigits(num);
        int numCopy = num;
        // System.out.println("no of digits: " + NumOfDigits); // java debugger
        int finalNumber = 0;
        while (num > 0){
            int Lastdigit = num % 10;
            num /= 10;
            finalNumber += power(Lastdigit, NumOfDigits);

        }
        // System.out.println("final number is " + finalNumber); // java debugger
        return finalNumber == numCopy;
    }

    public static int power(int num1,int num2){ // num2 is the no of the digits
        int result = num1; 
        int i = 1;
        while (i < num2){
            result *= num1; // the num1 multiply by the result(itself or its square..) by the times the loop
            i++;            // runs i.e loop runs two times answer will ne num1^3
        }
        // System.out.println("Power of " + num1 + " is " + num2);  // java debugger
        return result;
    }

    public static int noOfDigits(int num){
        int digits = 0;
        while(num > 0){ //loop will run until all the numbers that are divisible by ten are greater than 0 
            digits++; // this will add 1 in digits each time a loop runs 
            num /= 10; // this will delete the last digit of the input value and run the loop untill no digit
        }               // left behind
        return digits; // this will return the value of the digits to the function call
    }
}
