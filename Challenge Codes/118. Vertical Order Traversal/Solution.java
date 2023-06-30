import java.util.* ;
import java.io.*; 
/************************************************************

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

************************************************************/

import java.util.ArrayList;

public class Solution 
{
    static class Pair {
        TreeNode<Integer> node;
        int vd;
        Pair(TreeNode<Integer> node, int vd) {
            this.node = node;
            this.vd = vd;
        }
    }
    public static ArrayList<Integer> verticalOrderTraversal(TreeNode<Integer> root) 
    {
        //    Write your code here.
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        Map<Integer, ArrayList<TreeNode<Integer>>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        
        q.add(new Pair(root, 0));
        
        while (!q.isEmpty()) {
            Pair pair = q.poll();
            TreeNode<Integer> node = pair.node;
            int vd = pair.vd;
            
            ArrayList<TreeNode<Integer>> list = map.getOrDefault(vd, new ArrayList<>());
            list.add(node);
            map.put(vd, list);
            
            if (node.left != null) {
                q.add(new Pair(node.left, vd-1));
            }
            if (node.right != null) {
                q.add(new Pair(node.right, vd+1));
            }
        }
        
        for (ArrayList<TreeNode<Integer>> list: map.values()) {
            for (TreeNode<Integer> node: list) {
                ans.add(node.data);
            }
        }
        
        return ans;
    }
}
