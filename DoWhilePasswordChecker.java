
import java.util.Scanner;

public class DoWhilePasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wellcome to set your password\n ");
        String password;
        do { 
            System.out.print("Please enter your password: ");
            password = input.next();

        } while (!isValidPasword(password));
        System.out.println("Thanks for entering the valid pasword");
    }

    public static boolean isValidPasword(String password){
        return password.length() > 6 ;
    }
}
