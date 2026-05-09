import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Lexical Twist Puzzle
 * ------------------------------------------------------------
 * UC5 - Word Transformation
 *
 * If the second word is the reverse of the first,
 * the reversed word is transformed by:
 * 1. Converting to lowercase
 * 2. Replacing vowels with '@'
 *
 * Author : Shivani
 * ------------------------------------------------------------
 */

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String firstWord = scanner.nextLine();

        if (firstWord.contains(" ")) {
            System.out.println(firstWord + " is an invalid word");
            return;
        }

        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine();

        if (secondWord.contains(" ")) {
            System.out.println(secondWord + " is an invalid word");
            return;
        }

        // Reverse first word
        String reversedWord =
                new StringBuilder(firstWord).reverse().toString();

        // Check reverse relationship
        if (reversedWord.equalsIgnoreCase(secondWord)) {

            // Convert to lowercase
            String transformed = reversedWord.toLowerCase();

            // Replace vowels with '@'
            transformed = transformed.replaceAll("[aeiou]", "@");

            // Display transformed word
            System.out.println(transformed);

        } else {
            System.out.println("Not a reverse match");
        }

        scanner.close();
    }
}