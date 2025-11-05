//even and using the bitwise operator

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("entre the number: ");
        int number = input.nextInt();

        if ((number & 1) == 1){ // bitwise operator every odd binary number ends with 1 
            System.out.println("Your number is odd");
        } else {
            System.out.println("Your number is even");
        }
    }
}

