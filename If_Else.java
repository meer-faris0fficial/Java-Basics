
public class If_Else {
    public static void main (String args[]){
       
       boolean isSenior = false;  // if the argument is true then it runs the if statement if it is false thenit runs the else statement 
       boolean isadult = true;

       if (isSenior){    // the statement in the round bracket must be boolean if not then it not runs if statement
        System.out.print("you are a senior citizen");
       } else if (isadult){
        System.out.println("you are an adult.");
       } else {
        System.out.println("you are a child");
       }
    }    
}
