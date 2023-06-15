import java.util.* ;import java.io.*; 
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

public class Solution 
{
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        //    Write your code here.
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(1, root));
        int curLevel = 0;
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            int level = pair.level;
            TreeNode<Integer> cur = pair.node;
            if (level > curLevel) {
                curLevel = level;
                list.add(cur.data);
            }
            if (cur.left != null) {
                queue.add(new Pair(level+1, cur.left));
            }
            if (cur.right != null) {
                queue.add(new Pair(level+1, cur.right));
            }
        }
        return list;
    }
}

class Pair {
    int level;
    TreeNode<Integer> node;
    Pair (int level, TreeNode<Integer> node) {
        this.level = level;
        this.node = node;
    }
}
