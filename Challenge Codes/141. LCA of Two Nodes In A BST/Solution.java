import java.util.* ;
import java.io.*; 
/*

    Following is the TreeNode class structure

    class TreeNode<T> 
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

*/

public class Solution 
{

	public static TreeNode<Integer> LCAinaBST(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q) 
    {		
        // Write your code here
        if (root == null)
            return root;
        if(root == p || root == q)
            return root;
        TreeNode<Integer> leftAncestor = LCAinaBST(root.left, p, q);
        TreeNode<Integer> rightAncestor = LCAinaBST(root.right, p, q);
        if (leftAncestor == null)
            return rightAncestor;
        if (rightAncestor == null) 
            return leftAncestor;
        return root;
	}
}