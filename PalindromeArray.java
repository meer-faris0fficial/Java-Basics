public class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("Wellcome to the palindrome checker");
        int[] numArr = ArrayUtility.inputArray();
        boolean ispalen = isPalindrome(numArr);
        if (ispalen){
            System.out.println("Your array is palindrome");
        } else {
            System.out.println("your array is not palindrome");
        }

    }
    public static boolean isPalindrome(int[] numArr){
        int i = 0;
        while (i < numArr.length / 2){
            if (numArr[i] != numArr[numArr.length -1 -i ]){
                return false;
            }
            i++;
        }

        return true;
    }
}
