// first unary operator is " - " minus x = -y the value turn into negative
// PRE INCREMENT( x = ++y) : increment the value by 1 and then use it in our statement 
// POST INCREMENT ( x = y++): use current value in the statement and then increment it by 1
// PRE DECREMENT ( x = --y ) : decrement the value by 1 and then use it in our statement 
// POST DECREMENT ( x = y-- ): use current value in the statement and then decrement it by 1

// NOTE:
// from every operations first unary operaations runs then arithmatic operations runs
// then shift  operators runs then relational operators runs then bitwise operator runs then
// logical operators runs then termary operators runs then at the end assignment operators runs 

public class Unary_Operators {
    public static void main(String[] args) {
        int x = 3;
        int y = -x;  // the value of x will became negative
        System.out.println(y);

        int a = 5;
        a++;  //
        System.out.println(a);
        
        int p = 3;       // (p++) tell that first the value of the p use in the operation then increment take place in it
        System.out.println(p++); // it will give the output of 3 not 4 as it tell us to first use the pre value of the p
        System.out.println(p); // it will now print the value of the p as 4
        System.out.println(++p); // first increment the value of the p then use it in the operation 

        // the value of the variable "a" in the below statement will be the 6 that is the output of the 
        // above statement a++ 
        ++a;
        System.out.println(a);
        // same process with the decrement
    }
}