// variable name donot start with numbers or name of the class 
// but numbers can be use in the name of the variable like zian23asain = 34
// "_" "-" and "$" is valid in the variable name
// java identifier is case sensitive
// @,# is invalid in variable name
// variable data types like int, float,string, is invalid as a variable name 
// LITERALS are the values of the variable that are use in the program 
// blank string is also valid
// INTEGERS DATA TYPES: int = 4 Bytes ,   short = 2 Bytes (range of numbers is from -32k to +32k)
//  long = 8 Bytes (it has the longest range of numbers) , byte = 1 Bytes( range is -128 to 127)
// FLOATING POINT DATA TYPES : float = 4 Bytes(upto 6,7 decimal digits), double = 8 Bytes(15 decimal digits) 

public class VariableNames {
    public static void main(String[] args) {
        int number;      // int,float,char and others are called data identifier
        number = 34;     // number is called variable identifier
        float myFloat;              
        myFloat = 3.4f;
        char onlyOneAlphabet;
        onlyOneAlphabet = 'A';
        String my_String = "i am the don!";
        double my_king = 23.3422;
        byte smallNo = -23;
        boolean heIsVegetarian = true;
        System.err.println(heIsVegetarian);
        System.err.println(number);
        System.err.println(my_king);
        System.err.println(my_String);
        System.err.println(myFloat);
        System.err.println(onlyOneAlphabet);
        System.err.println(smallNo);
    }
}

