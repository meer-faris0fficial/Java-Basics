



public class SumAverage2DArray {
    public static void main(String[] args) {
        System.out.println("Wellcome to sum and average of 2D Array");
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sum(numArr);
        double avg = average(numArr);
        System.out.println("Your sum of array is: " + sum);
        System.out.println("Your average of array is: " + avg);
    }
    public static double average(int[][] numArr){
        if (numArr.length == 0){
            return 0;
        }
        int rows = numArr.length;
        int col = numArr[0].length; // give the no of rows
        double size = rows * col; // here rows is 3 and col is 3 so the size is 9
        return sum(numArr) / size;
    }
    public static long sum(int[][] numArr){
        long sum = 0;
        int i = 0;
        while (i < numArr.length){
            int j= 0;
            while (j < numArr.length){
                sum += numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

}
