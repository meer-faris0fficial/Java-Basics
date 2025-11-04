// 2D Array A[0][1]  first put the row index in [0] then put the coloumn index in [1]
// data will not be arrange in sequence but are arrange in the rows and coloumns
// it is a multidimensional array and are known as array of an array it can be converted into 3darray


public class Array2D {
    public static void main(String[] args) {
        // int[][] numArr = new int[2][3]; // it is hetrogenous array
        int[][] inArr = {{1,2,3}, {8,7,9}, {4,5,6}}; // here rows are two and coloumns are 3 it uses 2 loops
        // numArr[0][1] = 5;
        
        int i = 0;
        while (i < inArr.length){ // i represent the no rows
            int j = 0;
            while ( j < inArr[i].length){
                System.out.print(inArr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
