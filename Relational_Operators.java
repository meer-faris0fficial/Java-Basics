
import java.util.Scanner;

// Relational_Operators <,>,<=,>=,==<,!=

public class Relational_Operators {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Wellcome to the Driving License Portal.");
        System.out.print("entre your age: ");
        int age = input.nextInt();

        if ( age >= 18 ) { // it is a combination of the boolean which is true or false
            System.out.println("You are elligible for the driving");
        } else {
            System.out.println("chal beta cycle chala.");
        }
    }
}
