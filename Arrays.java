// arrays is just a list of values. Inex starts with zero. 
// arrays are used for storing multiple values in a single variable
// arrays are represented by square brackets []
// arrays are treated as objects
// arrays size can never be changed once decleared
// it is 1d array it detect the position in the memory in line
// An array is an referance type in java

public class Arrays {
    public static void main(String[] args) {
        // int[] myArr = new int[5]; // 5 is not included index is from 0 to 4
        // myArr[0] = 98;
        // myArr[3] = 8;
        // myArr[4] = 0;
        // myArr[2] = 96;
        // myArr[1] = 97;
        int[] myArr = {98, 97, 96, 8, 0};
        // int index = 2;

        // System.out.println(myArr[0]);
        // System.out.println(myArr[1]);
        // System.out.println(myArr[index]); // instead of index we can use another variable
        // System.out.println(myArr[3]);
        // System.out.println(myArr[4]);

        int index = 0;
        while (index < myArr.length){ // give the length of the array myArr
            System.out.println(myArr[index]);
            index++;
        }

        // array can be of any data type
        // String[] atrArr = new String[4]; // the size of this array is 4
        // atrArr[0] = "My String";
        
        String[] newStrArr = {"first", "second", "third"};
        System.out.println(newStrArr.length);

    }
}
