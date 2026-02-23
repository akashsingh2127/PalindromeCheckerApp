/**
 * ================================================
 * UseCase2PalindromeCheckerApp
 * ================================================
 *
 * Use Case 2: Print a Hardcoded Palindrome Result
 *
 * Goal:
 * - Display whether a hardcoded string is a palindrome.
 *
 * Flow:
 * - Program starts
 * - Hardcoded string is checked
 * - Result is printed
 * - Program exits
 *
 * Concepts:
 * - String manipulation
 * - Conditional statements
 * - Console output
 *
 * @author Developer
 * @version 1.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String word = "madam";  // hardcoded string

        // Reverse the string
        String reversed = new StringBuilder(word).reverse().toString();

        // Check if palindrome
        if (word.equals(reversed)) {
            System.out.println("The word '" + word + "' is a palindrome.");
        } else {
            System.out.println("The word '" + word + "' is NOT a palindrome.");
        }
    }
}