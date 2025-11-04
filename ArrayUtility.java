
import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size){
            System.out.print("Please enter element number " + (i + 1) + ": ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }

    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of rows elements: ");
        int rows = input.nextInt();
        System.out.print("Please enter the number of coloumns elements: ");
        int coloumns = input.nextInt();
        int[][] numArray = new int[rows][coloumns];

        int i = 0;
        while (i < rows){
            int j = 0;
            while (j < coloumns){ // it runs continuously untill j < coloumns satisfy
                System.out.print("Please enter the element row: " + (i + 1)
                        + ", colomn " + (j + 1) + ": ");
                numArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return numArray;
    }
    

    public static void displayArray(int[] numArr){
        int i= 0;
        while (i <numArr.length){
            System.out.print(numArr[i] + " ");
            i++;
        }
        System.out.println();
    }
}
