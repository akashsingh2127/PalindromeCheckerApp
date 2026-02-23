/**
 * ================================================
 * UseCase9PalindromeCheckerApp
 * ================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Goal:
 * - Check palindrome using recursion
 *
 * Concepts:
 * - Recursion
 * - Base condition
 * - Call stack
 *
 * Author: Developer
 * Version: 1.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String word = "level"; // hardcoded string

        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println("The word '" + word + "' is a palindrome.");
        } else {
            System.out.println("The word '" + word + "' is NOT a palindrome.");
        }
    }

    // Recursive palindrome check
    private static boolean isPalindrome(String word, int start, int end) {
        if (start >= end) {
            return true; // base condition
        }
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }
        return isPalindrome(word, start + 1, end - 1); // recursive call
    }
}