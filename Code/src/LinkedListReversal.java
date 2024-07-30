// Iterative Approach
// Use three pointers (prev, curr, next) to reverse the list.
// Traverse the list, reversing the next pointer of each node.
// When the loop ends, prev will be the new head of the reversed list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class LinkedListReversal {
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        printList(head);

        ListNode newHead = reverseList(head);

        System.out.println("Reversed list:");
        printList(newHead);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;  // Store next node
            curr.next = prev;  // Reverse current node's pointer
            prev = curr;       // Move pointers one position forward
            curr = next;
        }

        return prev; // New head of the reversed list
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
