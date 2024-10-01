/*
 * This program is a dice game.
 *
 * @author Mohamad T
 * @version 1.0
 * @since 2024-10-1
 */

import java.util.Scanner;
import java.util.Random;

/**
 * This is the main class.
 */
final class Dice {
    /**
     * The maximum number that can be generated.
     */
    static final int maxRandomNumber = 6;

    /**
     * Prevent instantiation.
     */
    private Dice() { }

    /**
     * The main method.
     */
    public static void main(String[] args) {
        // Create scanner object to read input from user
        final Scanner scanner = new Scanner(System.in);

        // Generate random number
        final int randomNumber = (int)Math.floor(Math.random()
            * (maxRandomNumber - 1) + 1);

        // Initialize attempts counter
        int attempts = 1;

        // Input loop
        while(true) {
            // Initial input prompt
            System.out.printf("Guess a number between 1 - 6: ");
            final String guessStr = scanner.nextLine();

            // Verify input
            try {
                // Convert guess to an int
                final int guess = Integer.parseInt(guessStr);

                // Decide what to do with the guess
                if (guess == randomNumber) {
                    System.out.println("You guessed the right number!" + 
                      "\nIt took you " + attempts + " attempts.\n");
                    break;
                } else if (guess > maxRandomNumber) {
                    System.out.println("That is not 1 - 6.\nTry again!\n");
                } else if (guess < randomNumber) {
                    System.out.println("Your guess is too low.\nTry again!\n");
                } else if (guess > randomNumber) {
                    System.out.println("Your guess is too high.\nTry again!\n");
                }

                // Add to attempts counter
                attempts++;
            } catch (NumberFormatException error) {
              System.out.println("\nInvalid input. Try again.\n");
            }
        }
    }
}
