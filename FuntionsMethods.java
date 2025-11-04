

public class FuntionsMethods {
    public static void main(String[] args) {
        greetUser();  // method/function call or method invoke
        // first functions call runs then below line runs 
        System.out.println("Method calling complete");
        starPattern();
}
 
// void is a return that give nothing in return 
    public static void greetUser() {
        System.out.println("Good Morning");

    }
    
// making a star pattern using a while loop in a function
    public static void starPattern() {
        int rows = 0;
        while (rows < 5){
            System.out.print("*");
            int i = 0;
            while (i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println("");
            rows++;
        }
    }

}
