
import java.util.Scanner;

public class RecurssionFibonnaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to printing fibonnaci series");
        System.out.print("Enter the number of elements to be printed: ");
        int count = input.nextInt();
        for (int i = 1; i <= count; i++){
            System.out.print(fibonnaci(i) + " "); // calls the fibonnaci function 
        }
    }

    public static int fibonnaci(int position){
        if (position == 1){
            return 0;
        }
        if (position == 2){
            return 1;
        }
        return fibonnaci(position - 1) + fibonnaci(position - 2); 
    }
}
