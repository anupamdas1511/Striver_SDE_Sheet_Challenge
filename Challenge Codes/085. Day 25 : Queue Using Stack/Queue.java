import java.util.Stack;

public class Queue {
    // Define the data members(if any) here.
    private Stack<Integer> stack1, stack2;

    Queue() {
        // Initialize your data structure here.
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    void enQueue(int val) {
        // Implement the enqueue() function.
        if (!stack1.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        stack1.push(val);
        if (!stack2.isEmpty()) {
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }
    }

    int deQueue() {
        // Implement the dequeue() function.
        return stack1.isEmpty() ? -1 : stack1.pop();
    }

    int peek() {
        // Implement the peek() function here.
        return stack1.isEmpty() ? -1 : stack1.peek();
    }

    boolean isEmpty() {
        // Implement the isEmpty() function here.
        return stack1.isEmpty();
    }
}