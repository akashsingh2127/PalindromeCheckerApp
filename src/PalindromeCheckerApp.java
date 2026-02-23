/**
 * ================================================
 * UseCase8PalindromeCheckerApp
 * ================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Goal:
 * - Check palindrome using singly linked list
 *
 * Flow:
 * - Convert string to linked list
 * - Reverse second half
 * - Compare both halves
 *
 * Concepts:
 * - Singly Linked List
 * - Node traversal
 * - Fast & slow pointer technique
 * - In-place reversal
 *
 * Author: Developer
 * Version: 1.0
 */
public class PalindromeCheckerApp {

    // Node class for singly linked list
    static class Node {
        char data;
        Node next;
        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        String word = "racecar";  // hardcoded string
        Node head = stringToLinkedList(word);

        boolean isPalindrome = isPalindrome(head);
        if (isPalindrome) {
            System.out.println("The word '" + word + "' is a palindrome.");
        } else {
            System.out.println("The word '" + word + "' is NOT a palindrome.");
        }
    }

    // Convert string to linked list
    private static Node stringToLinkedList(String word) {
        Node head = new Node(word.charAt(0));
        Node current = head;
        for (int i = 1; i < word.length(); i++) {
            current.next = new Node(word.charAt(i));
            current = current.next;
        }
        return head;
    }

    // Check if linked list is palindrome
    private static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // Find middle using fast & slow pointers
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverseList(slow.next);

        // Compare first and second halves
        Node firstHalf = head;
        Node secondHalfCopy = secondHalf;  // to restore later
        boolean palindrome = true;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                palindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // Optional: restore the list (not required here)
        slow.next = reverseList(secondHalfCopy);

        return palindrome;
    }

    // Reverse a linked list
    private static Node reverseList(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}