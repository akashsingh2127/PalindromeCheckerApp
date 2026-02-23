/**
 * ================================================
 * UseCase5PalindromeCheckerApp
 * ================================================
 *
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Goal:
 * - Use stack to reverse characters and validate palindrome.
 *
 * Flow:
 * - Push characters into stack
 * - Pop and compare with original
 * - Print result
 *
 * Concepts:
 * - Stack (LIFO)
 * - Push and Pop operations
 * - String comparison
 *
 * Author: Developer
 * Version: 1.0
 */

import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String word = "deified"; // hardcoded string

        Stack<Character> stack = new Stack<>();

        // Push all characters onto stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop from stack and compare with original
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("The word '" + word + "' is a palindrome.");
        } else {
            System.out.println("The word '" + word + "' is NOT a palindrome.");
        }
    }
}