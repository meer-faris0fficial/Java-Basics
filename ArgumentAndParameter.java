// agrguments and parameters are like give and take i.e koi cheez khreedna app paisa deta han
// aur shopkeeper ap ko cheez deta ha

public class ArgumentAndParameter {
    public static void main(String[] args) {
        int num = sum(2,4); // in the function the first and the second are called arguments
        System.out.println("the sum of the number is: " + num);

    }

    public static int sum(int first, int second) { // in the function the first and the second are called parameters
        System.out.println("first number received: " + first);  
        System.out.println("second number received: " + second);
        int sum = first + second;                 
        return sum;

    }
}
