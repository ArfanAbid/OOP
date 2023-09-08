// Stack is very important concept in java 
// In Java, a stack is a data structure that follows the Last In, First Out (LIFO) principle. It means that the last element added to the stack is the first one to be removed.

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Create a stack to hold integers
        Stack<Integer> stack = new Stack<>();

        // Adding elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Displaying the stack
        System.out.println("Stack elements: " + stack);

        // Accessing the top element (last added element) without removing it
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Removing the top element from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Displaying the updated stack
        System.out.println("Stack elements after popping: " + stack);

        // Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Getting the size of the stack
        int size = stack.size();
        System.out.println("Size of the stack: " + size);
    }
}


// push(item): This function adds an element to the top of the stack. The element is placed at the top position, becoming the new "top" element.

// pop(): This function removes and returns the top element from the stack. The stack size reduces by one after this operation.

// peek(): This function returns the top element of the stack without removing it. It allows you to inspect the top element without modifying the stack.

// isEmpty(): This function checks if the stack is empty and returns a boolean value (true if the stack is empty, false otherwise).

// size(): This function returns the number of elements currently stored in the stack.
