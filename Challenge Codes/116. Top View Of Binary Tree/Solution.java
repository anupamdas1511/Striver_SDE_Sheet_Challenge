import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure:

    class BinaryTreeNode {
		int val;
		BinaryTreeNode left;
		BinaryTreeNode right;

		BinaryTreeNode(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

************************************************************/

public class Solution {

	static class Pair {
        BinaryTreeNode node;
        int vd;
        Pair(BinaryTreeNode node, int vd) {
            this.node = node;
            this.vd = vd;
        }
    }
	public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
		// Write your code here.
		ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        Map<Integer, ArrayList<BinaryTreeNode>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        
        q.add(new Pair(root, 0));
        
        while (!q.isEmpty()) {
            Pair pair = q.poll();
            BinaryTreeNode node = pair.node;
            int vd = pair.vd;
            
            ArrayList<BinaryTreeNode> list = map.getOrDefault(vd, new ArrayList<>());
            list.add(node);
            map.put(vd, list);
            
            if (node.left != null) {
                q.add(new Pair(node.left, vd-1));
            }
            if (node.right != null) {
                q.add(new Pair(node.right, vd+1));
            }
        }
        
        for (ArrayList<BinaryTreeNode> list: map.values()) {
            ans.add(list.get(0).val);
        }
        
        return ans;
	}
}