
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wellcome to the multiplication World\n");
        System.out.print("Entre the number: ");
        int num = scanner.nextInt();
        Table(num);

    }

    public static void Table(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + (num*i));
            i++;
        }
    }
}
