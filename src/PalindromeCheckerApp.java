/**
 * ================================================
 * UseCase10PalindromeCheckerApp
 * ================================================
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Goal:
 * - Ignore spaces and case while checking palindrome
 *
 * Concepts:
 * - String preprocessing
 * - Regular expressions
 *
 * Author: Developer
 * Version: 1.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String word = "A man a plan a canal Panama"; // hardcoded string

        // Normalize string: remove spaces & convert to lowercase
        String normalized = word.replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(normalized)) {
            System.out.println("The phrase '" + word + "' is a palindrome.");
        } else {
            System.out.println("The phrase '" + word + "' is NOT a palindrome.");
        }
    }

    // Simple palindrome check using two-pointer technique
    private static boolean isPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}