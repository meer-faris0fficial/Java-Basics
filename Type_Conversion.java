// if we want to convert smaller values types that have small storage values it will convert smaller valaues 
//  type into into the larger data types however reverse gives the error but it is possible with 
// the following order
// implicit conversion: to convert smaller type into the larger data type
// long big = 45;
// float dec = 3;
// double d = 3.4f;
// Explicit function is the reverse of the implicit function 
// DATA will lose in the explicit function
// float edec = (float) 3.4;  3.4 is use as a double in this 
// long ebing = (long) 3.4;
// int eint = (int) 3.4;

public class Type_Conversion {
    public static void main(String[] args) {
        float myFloat = 5;   
        System.err.println(myFloat);
        int myInt = (int) 5.9f;  // it will convert float that is the larger data type into int that is smaller data type 
        System.out.println(myInt);  // however during conversion the data after the points will lose 

    }
}
