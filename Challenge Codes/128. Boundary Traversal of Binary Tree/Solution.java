import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the Binary Tree node structure:
    
   class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;

	    TreeNode(int data) {
		    this.data = data;
		    this.left = null;
		    this.right = null;
	    }

    }

************************************************************/

import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> traverseBoundary(TreeNode node){
		// Write your code here.
		ArrayList<Integer> ans = new ArrayList<>();
	    if (node == null)
            return ans;
        // get root
        ans.add(node.data);
 
        // get left boundary
        printBoundaryLeft(node.left, ans);
 
        // get leaves
        printLeaves(node.left, ans);
        printLeaves(node.right, ans);
 
        // get right boundary
        printBoundaryRight(node.right, ans);
        return ans;
	}

	static void printBoundaryLeft(TreeNode node, ArrayList<Integer> ans) {
	    if (node == null)
            return;
 
        if (node.left != null) {
            ans.add(node.data);
            printBoundaryLeft(node.left, ans);
        }
        else if (node.right != null) {
            ans.add(node.data);
            printBoundaryLeft(node.right, ans);
        }
	}
	static void printBoundaryRight(TreeNode node, ArrayList<Integer> ans) {
	    if (node == null)
            return;
 
        if (node.right != null) {
            printBoundaryRight(node.right, ans);
            ans.add(node.data);
        }
        else if (node.left != null) {
            printBoundaryRight(node.left, ans);
            ans.add(node.data);
        }
	}
	static void printLeaves(TreeNode node, ArrayList<Integer> ans) {
	    if (node == null)
            return;
 
        printLeaves(node.left, ans);
        if (node.left == null && node.right == null)
            ans.add(node.data);
        printLeaves(node.right, ans);
	}
}