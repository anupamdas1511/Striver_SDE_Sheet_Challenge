import java.util.* ;
import java.io.*; 
/*   
    Following is the Binary Tree node structure for referance:

    class TreeNode
    {
        int data;
        TreeNode left, right;
    
        public TreeNode(int item)
        {
            data = item;
            left = right = null;
        }
    }
*/

public class Solution {
    public static ArrayList<Integer> pathInATree(TreeNode root, int x) {
        // Write your code here..
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(root, x, new ArrayList<>(), ans);
        return ans;
    }

    private static void dfs(TreeNode root, int x, ArrayList<Integer> cur, ArrayList<Integer> ans) {
        if (root == null) return;

        if (root.data == x) {
            cur.add(x);
            ans.addAll(cur);
            cur.remove(cur.size()-1);
            return;
        }

        cur.add(root.data);
        dfs(root.left, x, cur, ans);
        dfs(root.right, x, cur, ans);
        cur.remove(cur.size()-1);
    }
}