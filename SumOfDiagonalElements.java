public class SumOfDiagonalElements {
    public static void main(String[] args) {
        System.out.println("Welcome to the diagoanl sum calculator");
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sumOfDiagonals(numArr);
        System.out.println("Sum of the diagonals is: " + sum);
    }

    public static long sumOfDiagonals(int[][] numArr){
        long leftsum = sumOfLeftDiagonals(numArr);
        long rightsum = sumOfRightDiagonals(numArr);
        long sum = leftsum + rightsum;
        if (numArr.length % 2 != 0){
            int ind = numArr.length / 2;
            sum -= numArr[ind][ind];
        }
        return sum;
    }

    public static long sumOfLeftDiagonals(int[][] numArr){
        long sum = 0;
        int i = 0;
        while (i < numArr.length){ //numArr.length is the no of rows in the matrix(square matrix)
            sum += numArr[i][i];
            i++;
        }
        return sum;
    }

    public static long sumOfRightDiagonals(int[][] numArr){
        long sum = 0;
        int i = 0;
        while (i < numArr.length){
            int col = numArr.length - 1 - i;
            sum += numArr[i][col];
            i++;
        }
        return sum;
    }

}
