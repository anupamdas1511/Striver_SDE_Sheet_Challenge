import java.util.* ;
import java.io.*; 
public class Solution {
	public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
		// WRITE YOUR CODE HERE
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        dfs(0, new ArrayList<>(), arr, res);
        return res;
	}

	private static void dfs(int i, ArrayList<Integer> cur, ArrayList<Integer> nums, ArrayList<ArrayList<Integer>> res) {
        if (i >= nums.size()) {
            res.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums.get(i));
        dfs(i + 1, cur, nums, res);
        cur.remove(cur.size() - 1);
        dfs(i + 1, cur, nums, res);
    }
}