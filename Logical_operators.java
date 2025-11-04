
import java.util.Scanner;
 
// following logical operators uses for the boolean operations
// Logical operators are AND(&&)(if both conditions in a argument then it give true otherwise it give false)
// OR( || ) (if any one of the argument is true then it give true if both are false then it give false otherwise it give true)
// NOT (it just convert true into false and vice versa )
// PRIORITY : first of all arithmatic and assignment operation runs then relational operation runs and at 
// the end logical operations runs

public class Logical_operators {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("wellcome to the ticket discount centre.");
        System.out.print("Entre your age: ");
        int age = input.nextInt();

        System.out.print("are you a female? (true/false): ");
        boolean gender = input.nextBoolean();

        if (age < 5){
            System.out.println("You got 75% discount.");
        } else if (gender) {
            System.out.println("Your discount is 50%.");
        } else if ( age > 60 && !gender ){
            System.out.println("You got 25% discount.");
        } else {
            System.out.println("You got no discount.");
        }
    }
}
