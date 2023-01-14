import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class GuessTheNumber {
    private static String intro = 
            "You have 15 chances to guess a number from 1-50000. Good Luck!";
    private static String firstGuess = 
            "Make your first guess: ";
    private static String tooBig = "Your guess was too big!";
    private static String tooSmall = "Your guess was too small!";
    private static String failed = "Wow you suck... better luck next time.";
    private static String again = "What's your next guess? ";
    private static String reveal = "Your number was : ";
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int number = (int) ((Math.random()*50000) + 1);
        int guessesMade = 0;
        int guessesLeft = 15;
        int guess = 0;

        System.out.println(intro + "\n\n" + firstGuess);
        System.out.println();
        while (guessesMade < 15) {
            guess = s.nextInt();
            guessesLeft--;
            System.out.println();
            if (guess == number) {
                System.out.println("\nCorrect! The number was " + number
                        + " and you got it in " + guessesMade + " guesses!");
                        guessesMade++;
                break;
            } else if (number > guess) {
                System.out.println(tooSmall);
                System.out.println(again + guessesLeft + " left\n");

            } else {
                System.out.println(tooBig);
                System.out.println(again + guessesLeft + " left\n");
            }
            guessesMade++;
        }
        if (guess != number) {
            System.out.println(failed);
            System.out.println(reveal + number);
        }
    }
}