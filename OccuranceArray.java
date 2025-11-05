
import java.util.Scanner;

public class OccuranceArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wellcome to Array Occurances\n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Now enter the number you want to find: ");
        int num = input.nextInt();
        int occurances = noOfOccurances(numArr, num);
        System.out.println("Your element was found " + occurances + " times in the array");

    }
    public static int noOfOccurances(int[] numArr, int num){
        int occ = 0;
        int i = 0;
        while (i < numArr.length){
            if (numArr[i] == num ) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}
