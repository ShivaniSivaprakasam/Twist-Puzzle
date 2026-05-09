import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Lexical Twist Puzzle
 * ------------------------------------------------------------
 * UC4 - Reverse Relationship Check
 *
 * This program checks whether the second word
 * is the reverse of the first word.
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

        // Validation
        if (firstWord.contains(" ")) {
            System.out.println(firstWord + " is an invalid word");
            return;
        }

        // Read second word
        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine();

        // Validation
        if (secondWord.contains(" ")) {
            System.out.println(secondWord + " is an invalid word");
            return;
        }

        // Reverse first word
        String reversedWord =
                new StringBuilder(firstWord).reverse().toString();

        // Compare ignoring case
        if (reversedWord.equalsIgnoreCase(secondWord)) {
            System.out.println("Reverse Match Found");
        } else {
            System.out.println("Not a Reverse Match");
        }

        scanner.close();
    }
}