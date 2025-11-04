
import java.util.Scanner;

// BITWISE operators uses the NUMBER SYSTEMS like decimal number system
// following all the operations are perform on the integers and on the binary numbers level
// AND operator (&) perform on the two integers and on the binary level if one integer is one and other is 
// zero it give the output of zero and vice versa 
// OR (|) 
// XOR (^) : if the both the bits are one or zero it give the output of the zero otherwise one if any of them is one or zero it give one as a output
// NOT (~) : it simply reverse the output it is also known as compliment
// LEFT SHIFT OPERATOR (<<) : shift the left operands bits to the left i.e 4 << 1 first 4 is converted into th
// binary (0100) form then the binary numbers shifted to the left side by numbers as given like 1 in the 
// above figure and the no of zeros will be added at the end of the binary no which are equal to the 
// shiftes numbers
// RIGHT SHIFTED OPERATOR (>>) : same as the left shift operator but in the reverse order

public class BitwiseOperators {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("SHowcasing bitwise and operator\n");
        System.out.print("Please entre the first number: ");
        int first = input.nextInt();
        System.out.print("Please entre the second number: ");
        int second = input.nextInt();

        int result = first & second;
        System.out.println("the result of the AND operation is: " + result );

        int result1 = first | second;
        System.out.println("the result of the OR operation is: " + result1);

        int result2 = first ^ second;
        System.out.println("the result of the XOR operation is: " + result2);

        int result3 =  ~first;
        System.out.println("the result of the NOT operation is: " + result3);

        int result4 = first << 4;  // a << n   =   a * (2^n) in left shift this occours
        System.out.println("the result of the LEFT SHIFT operation is: " + result4);

        int result5 = first >> 4; // the result will be divided by the no we give a >> n   =   floor(a / (2^n))
        System.out.println("the result of the right SHIFT operation is: " + result5);        
    }
}
