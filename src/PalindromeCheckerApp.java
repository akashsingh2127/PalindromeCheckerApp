/**
 * ================================================
 * UseCase7PalindromeCheckerApp
 * ================================================
 *
 * Use Case 7: Deque-Based Optimized Palindrome Checker
 *
 * Goal:
 * - Use Deque to compare front and rear elements efficiently
 *
 * Flow:
 * - Insert characters into deque
 * - Remove first & last and compare
 * - Continue until deque is empty
 *
 * Concepts:
 * - Deque (Double Ended Queue)
 * - Optimized palindrome check without extra reversal
 *
 * Author: Developer
 * Version: 1.0
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String word = "noon"; // hardcoded string

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear until deque is empty
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();
            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The word '" + word + "' is a palindrome.");
        } else {
            System.out.println("The word '" + word + "' is NOT a palindrome.");
        }
    }
}