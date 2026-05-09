import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Lexical Twist Puzzle
 * ------------------------------------------------------------
 * UC2 - Accept Word Inputs
 *
 * This program accepts two words from the user.
 *
 * Author : Shivani
 * ------------------------------------------------------------
 */

public class LexicalTwistPuzzle {

    /**
     * Main method - Entry point of the application
     */
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Read first word
        System.out.print("Enter first word: ");
        String firstWord = scanner.nextLine();

        // Read second word
        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine();

        // Display entered words
        System.out.println("First Word  : " + firstWord);
        System.out.println("Second Word : " + secondWord);

        // Close scanner resource
        scanner.close();
    }
}