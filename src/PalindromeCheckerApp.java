/**
 * ================================================
 * UseCase3PalindromeCheckerApp
 * ================================================
 *
 * Use Case 3: Palindrome Check Using String Reverse (with loop)
 *
 * Goal:
 * - Check whether a string is a palindrome by reversing it using a loop.
 *
 * Flow:
 * - Reverse string using for loop
 * - Compare original and reversed strings
 * - Display result
 *
 * Concepts:
 * - Loop (for loop)
 * - String concatenation
 * - equals() method
 *
 * @author Developer
 * @version 1.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String word = "racecar";  // hardcoded string

        String reversed = ""; // to build reversed string

        // Reverse the string using loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);  // string concatenation (inefficient, but illustrative)
        }

        // Check palindrome
        if (word.equals(reversed)) {
            System.out.println("The word '" + word + "' is a palindrome.");
        } else {
            System.out.println("The word '" + word + "' is NOT a palindrome.");
        }
    }
}