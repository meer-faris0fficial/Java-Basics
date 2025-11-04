
import java.util.Scanner;

class DeleteFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wellcome to array deletion");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Now enter the number you want to delete: ");
        int numToDelete = input.nextInt();
        int[] newArr = deletenumber(numArr, numToDelete);
        System.out.println("Here is your new array");
        ArrayUtility.displayArray(newArr);

    }
    public static int[] deletenumber(int[] numArr, int numToDelete){
        int occ = OccuranceArray.noOfOccurances(numArr, numToDelete);
        if (occ == 0){
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];
        
        int i = 0, j = 0;
        while (i < numArr.length){
            if (numArr[i] != numToDelete){
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        

        return newArr;
    }

}