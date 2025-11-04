
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);   // it is the must line that is use to entre the input
        System.out.print("please entre your name: ");  
        String name = input.nextLine();  // .nextline() is use for string and is different for other variable identifier
        System.out.println("Good Morning, " + name);  // STRING CONCATINATION is use in this 
        System.out.print(name +" , also tell me your age: "); // string concatination means to join two strings
        int age = input.nextInt();
        System.out.println("your age is: " + age);
        // ADD TWO NUMBERS
        System.out.print("ENTRE the first no: ");
        int firstNo = input.nextInt();
        System.out.print("Please entre the second number: ");
        int secondNumber = input.nextInt();
        int sum = firstNo + secondNumber;
        System.out.println("The sum of the two number is: " + sum);
    }                                     
}
