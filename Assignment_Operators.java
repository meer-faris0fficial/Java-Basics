// ASSIGNMENT OPERATORS "=" assign the right side operand's values to the left side operand's values
// i.e a = 3 assign the value 3 to the variable "a"
// " = " is an assignment operator not the equal of the maths
// " += " is a modified additional assignment operator

public class Assignment_Operators {
    public static void main(String[] args) {
        int myint = 9;
        int newint = myint;
        System.out.println(myint);
        System.out.println(newint);
        //SWAP TWO NUMBERS
        int one_1 = 12;
        int three_3 = 12;
        System.out.println(one_1);
        int two_2 = 13;
        System.out.println(two_2);
        one_1 = two_2;
        System.out.println(one_1);
        two_2 = three_3;
        System.out.println(two_2);
    }
}
