import java.util.* ;
import java.io.*; 
/*

	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T val;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

*/

import java.util.ArrayList;

public class Solution {

  public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
    //Your code goes here
	ArrayList<Integer> list = new ArrayList<>();
	if (root == null) return list;
	Queue<BinaryTreeNode> queue = new LinkedList<>();
	queue.add(root);
	while (!queue.isEmpty()) {
		BinaryTreeNode cur = queue.poll();
		list.add(cur.val);
		if (cur.left != null) {
			queue.add(cur.left);
		}
		if (cur.right != null) {
			queue.add(cur.right);
		}
	}
	return list;
  }

}