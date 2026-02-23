/**
 * ================================================
 * UseCase6PalindromeCheckerApp
 * ================================================
 *
 * Use Case 6: Queue + Stack Based Palindrome Check
 *
 * Goal:
 * - Demonstrate FIFO vs LIFO using Queue and Stack
 * - Compare dequeue (queue) vs pop (stack) to check palindrome
 *
 * Concepts:
 * - Queue (FIFO)
 * - Stack (LIFO)
 * - Enqueue & Dequeue operations
 * - Logical comparison
 *
 * Author: Developer
 * Version: 1.0
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String word = "radar"; // hardcoded string

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue characters to queue and push to stack
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            queue.add(ch);   // enqueue
            stack.push(ch);  // push to stack
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();  // dequeue
            char fromStack = stack.pop();     // pop
            if (fromQueue != fromStack) {
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