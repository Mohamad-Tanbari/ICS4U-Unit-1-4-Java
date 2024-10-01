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
    final int maxRandomNumber = 6;

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

        int attempts = 1;

        // Input loop
        while(attempts < 5) {
            final String guessStr = scanner.nextLine();

            try {
                final int guess = Int.parseInt(guessStr);

                
            } catch (NumberFormatException error) {
              System.out.println("Invalid input. Try again.");
            }
            attempts++;
        }

    }
}
