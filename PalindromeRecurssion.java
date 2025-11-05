
import java.util.Scanner;

public class PalindromeRecurssion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to palindrome checker");
        System.out.print("Enter the string to be checked: ");
        String str = input.next();
        System.out.println("Your string is "+ (isPalindrome(str) ? "palindrome" : "not palindrome"));
        input.close();
    }

    public static boolean isPalindrome(String str){
        if (str.length() <= 1){
            return true;
        }
        int lastpos = str.length() - 1; // check the first and last element of string
        if (str.charAt(0) != str.charAt(lastpos)){
            return false;
        }
        String newStr = str.substring(1, lastpos);// check remaining elements of the string
        return isPalindrome(newStr);
    }
}
