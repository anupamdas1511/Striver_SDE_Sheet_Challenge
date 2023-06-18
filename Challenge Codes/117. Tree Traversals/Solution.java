import java.util.* ;
import java.io.*; 
/************************************************************

	Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}

************************************************************/

public class Solution {
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        // Write your code here.
		List<Integer> inOrder = new ArrayList<>();
		List<Integer> preOrder = new ArrayList<>();
		List<Integer> postOrder = new ArrayList<>();
		getInOrder(root, inOrder);
		getPreOrder(root, preOrder);
		getPostOrder(root, postOrder);
		List<List<Integer>> result = new ArrayList<>();
		result.add(inOrder);
		result.add(preOrder);
		result.add(postOrder);
		return result;
    }

	private static void getInOrder(BinaryTreeNode<Integer> root, List<Integer> list) {
		if (root == null) return;
		getInOrder(root.left, list);
		list.add(root.data);
		getInOrder(root.right, list);
	}

	private static void getPreOrder(BinaryTreeNode<Integer> root, List<Integer> list) {
		if (root == null) return;
		list.add(root.data);
		getPreOrder(root.left, list);
		getPreOrder(root.right, list);
	}

	private static void getPostOrder(BinaryTreeNode<Integer> root, List<Integer> list) {
		if (root == null) return;
		getPostOrder(root.left, list);
		getPostOrder(root.right, list);
		list.add(root.data);
	}
}
