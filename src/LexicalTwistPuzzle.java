import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * ------------------------------------------------------------
 * Lexical Twist Puzzle
 * ------------------------------------------------------------
 * UC7 - Rule Based Output
 *
 * Outputs characters based on vowel and consonant
 * distribution rules.
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

        String combinedWord =
                (firstWord + secondWord).toUpperCase();

        int vowels = 0;
        int consonants = 0;

        for (char ch : combinedWord.toCharArray()) {

            if ("AEIOU".indexOf(ch) != -1) {
                vowels++;
            } else if (Character.isLetter(ch)) {
                consonants++;
            }
        }

        // Store unique characters preserving order
        Set<Character> uniqueCharacters =
                new LinkedHashSet<>();

        for (char ch : combinedWord.toCharArray()) {
            uniqueCharacters.add(ch);
        }

        int count = 0;

        if (vowels > consonants) {

            for (char ch : uniqueCharacters) {

                if ("AEIOU".indexOf(ch) != -1) {
                    System.out.print(ch + " ");
                    count++;
                }

                if (count == 2) {
                    break;
                }
            }

        } else if (consonants > vowels) {

            for (char ch : uniqueCharacters) {

                if ("AEIOU".indexOf(ch) == -1
                        && Character.isLetter(ch)) {

                    System.out.print(ch + " ");
                    count++;
                }

                if (count == 2) {
                    break;
                }
            }

        } else {

            System.out.println(
                    "Vowels and consonants are equal");
        }

        scanner.close();
    }
}