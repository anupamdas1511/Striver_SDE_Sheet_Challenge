/*************************************************************

Following is the Binary Tree Node structure:

    class TreeNode<T> {
		public T data;
		public BinaryTreeNode<T> left;
		public BinaryTreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = null;
			right = null;
	  	}
    }

*************************************************************/

public class Solution {
	public static int diameterOfBinaryTree(TreeNode<Integer> root) {
		// Write your code here.
        int[] diameter = new int[1];

        height(root,diameter);

      	return diameter[0];
	}

	private static int height(TreeNode<Integer> root, int[] diameter){
        
        if(root == null){
            return 0;
        }

        int left = height(root.left,diameter);
        int right = height(root.right,diameter);

        diameter[0] = Math.max(diameter[0],left + right);

        return Math.max(left,right)+1;
    }
}