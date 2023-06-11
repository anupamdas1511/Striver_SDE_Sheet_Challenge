import java.util.* ;
import java.io.*; 
public class Queue {

    // Initialise the singly linked list
    private static class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static Node front, rear;

    Queue() {
        // Implement the Constructor
        front = null;
        rear = null;
    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        // Implement the isEmpty() function
        return front == null;
    }

    void enqueue(int data) {
        // Implement the enqueue() function
        if (front == null) {
            front = new Node(data);
            rear = front;
            return;
        }
        rear.next = new Node(data);
        rear = rear.next;
    }

    int dequeue() {
        // Implement the dequeue() function
        if (front == null) return -1;
        int temp = front();
        front = front.next;
        return temp;
    }

    int front() {
        // Implement the front() function
        return (front != null) ? front.data : -1;
    }

}