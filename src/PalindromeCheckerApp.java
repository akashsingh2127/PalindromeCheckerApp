/**
 * ================================================
 * UseCase4PalindromeCheckerApp
 * ================================================
 *
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Goal:
 * - Convert string to char array
 * - Use two-pointer approach to check palindrome
 *
 * Flow:
 * - Convert string to char[]
 * - Compare start and end characters
 * - Display result
 *
 * Concepts:
 * - char[] array
 * - Array indexing
 * - Two-pointer technique
 * - Time-efficient comparison
 *
 * Author: Developer
 * Version: 1.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String word = "level"; // hardcoded string

        char[] chars = word.toCharArray(); // convert to char array
        boolean isPalindrome = true;       // flag

        int start = 0;
        int end = chars.length - 1;

        // Two-pointer comparison
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The word '" + word + "' is a palindrome.");
        } else {
            System.out.println("The word '" + word + "' is NOT a palindrome.");
        }
    }
}