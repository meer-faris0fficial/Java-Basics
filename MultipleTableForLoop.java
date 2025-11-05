
import java.util.Scanner;

public class MultipleTableForLoop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the table calculator");
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}