import java.util.*;

public class Solution {
    public static boolean isValidParenthesis(String s) {
        // Write your code here.
        Stack<Character> stack = new Stack<>();
        for( int i=0;i<s.length();i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) =='[') {
                stack.push(s.charAt(i));
            }else if(s.charAt(i) == ')') {
                if(stack.isEmpty()) return false;
                else if(stack.peek() == '(') stack.pop();
                else stack.push(s.charAt(i));
            }else if(s.charAt(i) == '}') {
                if(stack.isEmpty()) return false;
                else if(stack.peek() == '{') stack.pop();
                else stack.push(s.charAt(i));
            }else if(s.charAt(i) == ']') {
                if(stack.isEmpty()) return false;
                else if(stack.peek() == '[') stack.pop();
                else stack.push(s.charAt(i));
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}