import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Lexical Twist Puzzle
 * ------------------------------------------------------------
 * UC3 - Validate Single Word Constraint
 *
 * This program validates that each input contains
 * only a single word.
 *
 * Author : Shivani
 * ------------------------------------------------------------
 */

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read first word
        System.out.print("Enter first word: ");
        String firstWord = scanner.nextLine();

        // Validate first word
        if (firstWord.contains(" ")) {
            System.out.println(firstWord + " is an invalid word");
            return;
        }

        // Read second word
        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine();

        // Validate second word
        if (secondWord.contains(" ")) {
            System.out.println(secondWord + " is an invalid word");
            return;
        }

        System.out.println("Inputs accepted successfully.");

        scanner.close();
    }
}