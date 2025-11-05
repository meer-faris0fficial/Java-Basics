
import java.util.Scanner;

public class OccuranceForEachLoop {
    public static void main(String[] args) {
        System.out.println("Welcome to finding occurances");
        Scanner input = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Now enter the number you want to search: ");
        int element = input.nextInt();
        int occ = countOccurances(arr, element);
        System.out.println("Your element was found " + occ + " times");

    }
    public static int countOccurances(int[] nums, int element){
        int occ = 0;
        for (int num : nums){
            if (num == element){
                    occ++;
            }
        }
        return occ;
    }
}
