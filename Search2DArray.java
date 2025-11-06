
import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to 2D Search\n");
        int[][] numArr = ArrayUtility.input2DArray();
        System.out.print("Now enter the number you want to search: ");
        int num = input.nextInt();
        boolean isfound = search(numArr, num);
        if (isfound){
            System.out.println("your number was found");
        }
        else{
            System.out.println("your number was not found");
        }

    }
    public static boolean search(int[][] numArr, int num){
        int i = 0;
        while (i < numArr.length){
            int j = 0;
            while (j < numArr[i].length){ // length of the ith row
                if (numArr[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }

}
