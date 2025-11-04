
import java.util.Scanner;

public class GuessingGame {

    int random;

    public GuessingGame() {
        random = (int) Math.ceil(Math.random() * 100);
    }

    int guess(int guessNumber){
        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to number guessing game");
        GuessingGame game = new GuessingGame();
        int guess;
        int result;
        do{
            System.out.print("Guess the number: ");
            guess = input.nextInt();
            result = game.guess(guess);
            if (result == 0){
                System.out.println("Congrats your guess is correct");
            } else if (result < 0){
                System.out.println("Please guess higher");
            } else {
                System.out.println("please guess lower");
            }
        } while (result != 0);
    }
}
