import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Lexical Twist Puzzle
 * ------------------------------------------------------------
 * UC6 - Character Distribution Analysis
 *
 * This program combines both words and counts
 * vowels and consonants.
 *
 * Author : Shivani
 * ------------------------------------------------------------
 */

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String firstWord = scanner.nextLine();

        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine();

        // Combine words
        String combinedWord =
                (firstWord + secondWord).toUpperCase();

        int vowelCount = 0;
        int consonantCount = 0;

        // Count vowels and consonants
        for (char ch : combinedWord.toCharArray()) {

            if ("AEIOU".indexOf(ch) != -1) {
                vowelCount++;
            } else if (Character.isLetter(ch)) {
                consonantCount++;
            }
        }

        System.out.println("Vowels     : " + vowelCount);
        System.out.println("Consonants : " + consonantCount);

        scanner.close();
    }
}