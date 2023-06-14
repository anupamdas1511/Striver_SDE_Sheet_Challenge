import java.util.* ;
import java.io.*; 
public class Stack {

    // Define the data members.
    private Queue<Integer> q1;
    private Queue<Integer> q2;


    public Stack() {
        // Implement the Constructor.
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        // Implement the getSize() function.
        return q1.size();
    }

    public boolean isEmpty() {
        // Implement the isEmpty() function.
        return q1.isEmpty();
    }

    public void push(int element) {
        // Implement the push(element) function.
        if (q1.isEmpty()) {
            q1.add(element);
        } else {
            while (!q1.isEmpty()) {
                q2.add(q1.poll());
            }
            q1.add(element);
            while (!q2.isEmpty()) {
                q1.add(q2.poll());
            }
        }
    }

    public int pop() {
        // Implement the pop() function.
        return (q1.isEmpty()) ? -1 : q1.poll();
    }

    public int top() {
        // Implement the top() function.
        return (q1.isEmpty()) ? -1 : q1.peek();
    }
}