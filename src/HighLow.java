import java.util.Scanner;


public class HighLow {

    public static void highLow() {
        Scanner scanner = new Scanner(System.in);
        int max = 100;
        int min = 1;
        int range = max - min + 1;
        int answer = (int) ((Math.random() * range) + min);
        int guessCounter = 1;
        System.out.println("Lets play a game! Guess the number that is between 1 and 100.");
        int guess;
        do {
            System.out.printf("Guess #: %s\n", guessCounter);
            System.out.println("Pick a number between 1 and 100!");
            guess = scanner.nextInt();
            guessCounter++;
            if (guess < answer) {
                System.out.println("Guess Higher!");
            } else if (guess > answer) {
                System.out.println("Guess Lower!");
            }
        } while (answer != guess);
        System.out.println("GOOD GUESS!");
    }

    public static void main(String[] args) {
        highLow();
    }
}




//    The specs for the game are:
//
//        Game picks a random number between 1 and 100.
//        Prompts user to guess the number.
//        All user inputs are validated.
//        If user's guess is less than the number, it outputs "HIGHER".
//        If user's guess is more than the number, it outputs "LOWER".
//        If a user guesses the number, the game should declare "GOOD GUESS!"