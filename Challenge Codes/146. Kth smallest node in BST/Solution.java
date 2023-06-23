import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

	class TreeNode<T> 
	{
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) 
	    {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

************************************************************/


public class Solution 
{

	private static int count=0;
    private static int smallest=0;
	public static int kthSmallest(TreeNode<Integer> root, int k) 
	{
		//  Write your code here.
		DFS(root,k);
		int temp = smallest;
		smallest = 0;
		count = 0;
        return temp;
	}

	private static void DFS(TreeNode<Integer> root, int k){
        if(root==null) return;
        DFS(root.left,k);
        count++;
        if(count==k){
            smallest=root.data;
            return;
        }
        DFS(root.right,k);
    }

}
