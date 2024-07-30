/*
To implement a queue using two stacks, you can leverage the following approach:

Use Two Stacks:

Stack1 (stack1): This stack is used for enqueue operations (adding elements).
Stack2 (stack2): This stack is used for dequeue operations (removing elements).
Enqueue Operation:

Push elements onto stack1.
Dequeue Operation:

If stack2 is empty, move all elements from stack1 to stack2. This reverses the order of elements, making the oldest element (front of the queue) accessible from the top of stack2.
Pop the top element from stack2.
  */

import java.util.Stack;

public class QueueUsingStacks<T> {
    private Stack<T> stack1;
    private Stack<T> stack2;

    // Constructor to initialize the two stacks
    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation: Push onto stack1
    public void enqueue(T item) {
        stack1.push(item);
    }

    // Dequeue operation
    public T dequeue() {
        if (stack2.isEmpty()) {
            // Move elements from stack1 to stack2, reversing their order
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        return stack2.pop();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Peek at the front element of the queue
    public T peek() {
        if (stack2.isEmpty()) {
            // Move elements from stack1 to stack2, reversing their order
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        return stack2.peek();
    }

    public static void main(String[] args) {
        QueueUsingStacks<Integer> queue = new QueueUsingStacks<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Dequeued: " + queue.dequeue()); // Should print 1
        System.out.println("Peek: " + queue.peek()); // Should print 2
        System.out.println("Dequeued: " + queue.dequeue()); // Should print 2
        System.out.println("Dequeued: " + queue.dequeue()); // Should print 3

        // Uncommenting the following line will throw an exception because the queue is empty
        // System.out.println("Dequeued: " + queue.dequeue());
    }
}
/*
Constructor:

Initializes two stacks, stack1 and stack2.
enqueue Method:

Pushes an item onto stack1. This operation is O(1).
dequeue Method:

If stack2 is empty, moves all elements from stack1 to stack2 by popping from stack1 and pushing to stack2. This reverses the order of elements.
Pops from stack2, which represents the front of the queue.
Throws an exception if the queue is empty.
peek Method:

Similar to dequeue, it ensures stack2 has the current front element. If stack2 is empty, it transfers elements from stack1.
Returns the top element of stack2 without removing it.
isEmpty Method:

Returns true if both stacks are empty, indicating the queue is empty.
Test in main Method:
Enqueue Operations: Add elements 1, 2, and 3 to the queue.
Dequeue and Peek Operations: Perform operations and verify the results.
  */
