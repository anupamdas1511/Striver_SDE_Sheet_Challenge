import java.util.* ;
import java.io.*; 

public class Stack {

    private int[] arr;
    int index = 0;
    int capacity;

    Stack(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }
    void push(int num) {
        // Write your code here.
        if (index == capacity) return;
        arr[index] = num;
        index++;
    }
    int pop() {
        // Write your code here.
        if (index != 0) {
            index--;
            return arr[index];
        }
        return -1;
    }
    int top() {
        // Write your code here.
        if (index != 0) {
            return arr[index-1];
        }
        return -1;
    }
    int isEmpty() {
        // Write your code here.
        if (index == 0) return 1;
        else return 0;
    }
    int isFull() {
        // Write your code here.
        if (index == capacity) return 1;
        else return 0;
    }
}