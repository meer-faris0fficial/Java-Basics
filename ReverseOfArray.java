public class ReverseOfArray {
    public static void main(String[] args) {
        System.out.println("Wellcome to the array reversal");
        int[] numArr = ArrayUtility.inputArray();
        reverse(numArr);
        System.out.println("Your reversed array is ");
        ArrayUtility.displayArray(numArr);

    }
    public static void reverse(int[] arr){
        int i = 0;
        while (i < arr.length / 2){
            int swap = arr[i]; // swap = arr[0] = 1
            arr[i] = arr[(arr.length -1) - i]; // here arr[0] became arr[0] = arr[5] last element
            arr[(arr.length - 1) - i] = swap; // and here arr[5] = swap = 1 
            i++;
        }
    }

}
