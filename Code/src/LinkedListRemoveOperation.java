/* Removing the head node.
Removing a node in the middle.
Removing the tail node. */

// Assume
/*
class ListNode {
    int value;
    ListNode next;
    
    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}
*/


public class LinkedList {
    private ListNode head;

    // Constructor to initialize an empty list
    public LinkedList() {
        this.head = null;
    }

    // Method to add a node at the end of the list
    public void append(int value) {
        if (head == null) {
            head = new ListNode(value);
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(value);
    }

    // Method to remove a node with a specific value
    public void remove(int value) {
        if (head == null) {
            return; // List is empty
        }

        // Special case: removing the head node
        if (head.value == value) {
            head = head.next;
            return;
        }

        // Find the node to remove and its previous node
        ListNode current = head;
        while (current.next != null && current.next.value != value) {
            current = current.next;
        }

        // If the node was found, remove it
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

      public void removeTail() {
        if (head == null) {
            return; // List is empty
        }

        // Special case: if there's only one node
        if (head.next == null) {
            head = null;
            return;
        }

        // Traverse to the second-to-last node
        ListNode current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        // Remove the tail node
        current.next = null;
    }

    // Method to print the list
    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        System.out.println("Original list:");
        list.printList();

        list.remove(3); // Remove node with value 3

        System.out.println("List after removing 3:");
        list.printList();

        list.remove(1); // Remove head node

        list.removeTail(); // Remove the tail node

        System.out.println("List after removing head (1):");
        list.printList();
    }
}
