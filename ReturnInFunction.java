import java.util.Scanner;

public class ReturnInFunction {
   public static void main(String[] args) {
        greet();
        int first = readNumber();
        int second = readNumber();

        int sum = first + second;
        System.out.println("Sum of the numbers is: " + sum);

    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre the number: ");
        int number = input.nextInt();
        return number; // return put the value of the function to the main method it stop the fuction 
    }  // if the return is place in middle of the function then it will stop executing the function
    // and the remaining program will be terminated i.e stop executing below the return 

    public static void greet() {
        System.out.println("Wellcome to the calculator.");
    }
}

    