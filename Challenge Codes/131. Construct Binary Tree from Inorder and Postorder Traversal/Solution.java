/************************************************************
  
   Following is the TreeNode class structure
   
   class TreeNode<T> { 
        T data; 
        TreeNode<T> left;
        TreeNode<T> right;
  
        TreeNode(T data) { 
            this.data = data; 
            left = null; 
            right = null; 
        }
   }
    
 ************************************************************/
import java.util.*;
public class Solution {
	public static TreeNode<Integer> getTreeFromPostorderAndInorder(int[] postorder, int[] inorder) {
		// Write your code here.
    TreeNode<Integer> ret = new TreeNode<>(0), p = ret;
    Deque<TreeNode<Integer>> stk = new ArrayDeque<>();
    int i = inorder.length-1, j = postorder.length-1;
    while (j >= 0) {
        p.left = new TreeNode<>(postorder[j]);
        p = p.left;
        stk.push(p);
        while (postorder[j] != inorder[i]) {
            p.right = new TreeNode<>(postorder[--j]);
            p = p.right;
            stk.push(p);
        }
        j--;
        while (!stk.isEmpty() && stk.peek().data == inorder[i]) {
            i--;
            p = stk.pop();
        }
    }
    return ret.left;
	}
}
