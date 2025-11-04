// Arithametic operators
// % is a modulus operator to get remainder in the integer division it only use in the integral division
// Java follows order of operation (BODMAS Rule) but it is useful to use brackets

public class Arithmatic_Operators {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);  // it will give integer and donot give the decimal point
        System.out.println(a%b);
        System.out.println(a+(b-a)-a);
        System.out.println(9/3/3); // in this type of operation division follows from left to right first 9/3 then 9/3/3
        
        double x = 5;
        double y = 2;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);  // it will give double and do give the decimal point

    }
}
