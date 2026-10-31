/**
 * BracketStack.java
 *
 * Your Name:        __________________
 * Your Student ID:  __________________
 * Your Date:        __________________
 */

public class BracketStack {

    private class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public BracketStack() {
        top = null;
    }

    // TODO 1: Add an element to the top of the stack
    public void push(char value) {
        // connect newNode to the current top
        // update top
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    //  TODO 2: Remove and return the top element
    public char pop() {
        if (isEmpty()) {
            return '\0';
        }
        char data = top.data;
        // After saving top.data, the new top should be the node that comes after the current top.
        top = top.next;
        return data;
    }

    //  TODO 3: Return the top element without removing it
    public char peek() {
        // Control if the stack is empty; if it is, then return null (using '\0' for char)
        // if not return the data of the top
        if (isEmpty()) {
            return '\0';
        }
        return top.data;
    }

    //  TODO 4: Check whether the stack is empty
    public boolean isEmpty() {
        // TODO
        return top == null;
    }
}