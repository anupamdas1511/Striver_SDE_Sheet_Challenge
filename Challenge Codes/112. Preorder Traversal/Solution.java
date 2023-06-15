import java.util.* ;
import java.io.*; 
/*
	
	Following is the Binary Tree node structure:

	public class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;
	    TreeNode() {}
	    TreeNode(int val) { this.data = val; }
	    TreeNode(int val, TreeNode left, TreeNode right) {
	       this.data = val;
	        this.left = left;
	        this.right = right;
	    }
	}

*/

public class Solution {
    public static List < Integer > getPreOrderTraversal(TreeNode root) {
    	// Write your code here.
		List<Integer> list = new ArrayList<>();
        preOrder(root, list);
        return list;
    }

	private static void preOrder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        list.add(root.data);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }
}