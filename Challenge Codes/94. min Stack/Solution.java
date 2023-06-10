import java.util.* ;
import java.io.*; 

public class Solution {

    static class MinStack {

        private static LinkedList<MinNode> stack;

        private static class MinNode {
            int val;
            int min;
            MinNode() {
                this.min = 0;
                this.val = 0;
            }
            MinNode(int min, int val) {
                this.min = min;
                this.val = val;
            }
        }

        // Constructor
        MinStack() {
            // Write your code here.
            stack = new LinkedList<>();
        }

        // Function to add another element equal to num at the top of stack.
        void push(int val) {
            // Write your code here.
            int min=0;
            if (stack.size()==0) {
                min = val;
            } else {
                int curMin = stack.getFirst().min;
                min = Math.min(val, curMin);
            }
            stack.addFirst(new MinNode(min, val));
        }

        // Function to remove the top element of the stack.
        int pop() {
            // Write your code here.
            return (stack.isEmpty()) ? -1 : stack.removeFirst().val;
        }

        // Function to return the top element of stack if it is present. Otherwise
        // return -1.
        int top() {
            // Write your code here.
            // assert stack.peekFirst() != null;
            return (stack.isEmpty()) ? -1 : stack.peekFirst().val;
        }

        // Function to return minimum element of stack if it is present. Otherwise
        // return -1.
        int getMin() {
            // Write your code here.
            // assert stack.peekFirst() != null;
            return (stack.isEmpty()) ? -1 : stack.peekFirst().min;
        }
    }
}