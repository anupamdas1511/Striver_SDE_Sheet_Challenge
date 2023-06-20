import java.util.* ;
import java.io.*; 
public class Solution {

	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
		recursion(stack);
	}

	private static void recursion(Stack<Integer> stack) {
		if (stack.size()==1) return;
		int temp = stack.pop();
		recursion(stack);
		insert(stack, temp);
	}

	private static void insert(Stack<Integer> stack, int value) {
		if (!stack.isEmpty() && stack.peek() > value) {
			int top = stack.pop();
			insert(stack, value);
			stack.push(top);
		} else {
			stack.push(value);
		}
	}

}