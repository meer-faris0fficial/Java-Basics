
import java.util.Scanner;

// for the single line comments
/* for the multi line comments */
// folllowing /** */ is called JAVA DOCS
// Iterations : the no of times loop runs.

public class WhileLoops {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        int num = 1;  // initialization
        while (num <= 10){  // condition
            System.out.println(num);  // actual work
            num += 1; // updating the condition
        }

        // reverse counting
        int count = 50;
        while (count >= 20) {
            System.out.println(count);
            count += (-1);
        }    

        // taalking the input from the user 3 times
        int i = 0;
        while ( i < 3 ){
            System.out.print("entre the number: ");
            int inp = input.nextInt();
            System.out.println("number is: " + inp);
            i++;

        }
    }
}
