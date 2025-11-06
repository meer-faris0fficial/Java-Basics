
import java.util.Scanner;

public class SearchingInAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {3,6,8,87,65,4,68,23,9,98,34};
        System.out.println("Wellcome to the array Searching\n");
        System.out.print("Entre the number you want to search: ");
        int num = input.nextInt();
        boolean isfound = isfound(arr, num);
        if (isfound){
            System.out.println("Your number is found in the array");
        } else {
            System.out.println("Your number is not found in the array");
        }

    }
    public static boolean isfound(int[] arr, int num){
        int index = 0;
        while ( index < arr.length){
            if( arr[index] == num){
                return true;
            }
            index++;
        }
        return false;

        
    }
}
