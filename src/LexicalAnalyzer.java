import java.util.LinkedHashSet;
import java.util.Set;

/**
 * ------------------------------------------------------------
 * LexicalAnalyzer Class
 * ------------------------------------------------------------
 * Contains all puzzle processing logic.
 * ------------------------------------------------------------
 */

public class LexicalAnalyzer {

    /**
     * Checks reverse relationship
     */
    public boolean isReverseMatch(
            String firstWord,
            String secondWord) {

        String reversed =
                new StringBuilder(firstWord)
                        .reverse()
                        .toString();

        return reversed.equalsIgnoreCase(secondWord);
    }

    /**
     * Transform reversed word
     */
    public String transformWord(String word) {

        String reversed =
                new StringBuilder(word)
                        .reverse()
                        .toString()
                        .toLowerCase();

        return reversed.replaceAll("[aeiou]", "@");
    }

    /**
     * Analyse vowel and consonant distribution
     */
    public void analyseWords(
            String firstWord,
            String secondWord) {

        String combined =
                (firstWord + secondWord).toUpperCase();

        int vowels = 0;
        int consonants = 0;

        for (char ch : combined.toCharArray()) {

            if ("AEIOU".indexOf(ch) != -1) {
                vowels++;
            } else if (Character.isLetter(ch)) {
                consonants++;
            }
        }

        Set<Character> uniqueCharacters =
                new LinkedHashSet<>();

        for (char ch : combined.toCharArray()) {
            uniqueCharacters.add(ch);
        }

        int count = 0;

        if (vowels > consonants) {

            System.out.println(
                    "First 2 Unique Vowels:");

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

            System.out.println(
                    "First 2 Unique Consonants:");

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
    }
}