

public class MaximumValueForEach {
    public static void main(String[] args) {
        System.out.println("Welcome to finding the maximum in the array");
        int[] arr = ArrayUtility.inputArray();

        int max = Integer.MIN_VALUE;
        for (int num : arr){
            if (max < num){
                max = num;
            }
        }

        System.out.println("maximum number is " + max);
    }
}
