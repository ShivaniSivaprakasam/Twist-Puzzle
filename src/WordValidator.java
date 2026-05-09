/**
 * ------------------------------------------------------------
 * WordValidator Class
 * ------------------------------------------------------------
 * Handles validation of user inputs.
 * ------------------------------------------------------------
 */

public class WordValidator {

    /**
     * Validates whether the input is a single word
     *
     * @param word User input word
     * @return true if valid, otherwise false
     */
    public boolean isValidWord(String word) {

        return !word.contains(" ");
    }
}