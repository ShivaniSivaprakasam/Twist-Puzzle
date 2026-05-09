import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Lexical Twist Puzzle
 * ------------------------------------------------------------
 * Main driver class of the application.
 *
 * Responsibilities:
 * 1. Accept user inputs
 * 2. Coordinate validation
 * 3. Call analyser methods
 *
 * Author : Shivani
 * ------------------------------------------------------------
 */

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        WordValidator validator =
                new WordValidator();

        LexicalAnalyzer analyzer =
                new LexicalAnalyzer();

        System.out.println(
                "===== Lexical Twist Puzzle =====");

        // Read first word
        System.out.print("Enter first word: ");
        String firstWord = scanner.nextLine();

        // Validate first word
        if (!validator.isValidWord(firstWord)) {

            System.out.println(
                    firstWord + " is an invalid word");

            return;
        }

        // Read second word
        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine();

        // Validate second word
        if (!validator.isValidWord(secondWord)) {

            System.out.println(
                    secondWord + " is an invalid word");

            return;
        }

        // Reverse match logic
        if (analyzer.isReverseMatch(
                firstWord,
                secondWord)) {

            String transformed =
                    analyzer.transformWord(firstWord);

            System.out.println(
                    "Transformed Word: "
                            + transformed);

        } else {

            analyzer.analyseWords(
                    firstWord,
                    secondWord);
        }

        scanner.close();
    }
}