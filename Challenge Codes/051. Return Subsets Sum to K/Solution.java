import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k) 
	{
        // Write your code here.
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        dfs(arr, 0, 0, k, new ArrayList<>(), res);
        return res;
    }

    private static void dfs(ArrayList<Integer> arr, int index, int total, int k, ArrayList<Integer> cur, ArrayList<ArrayList<Integer>> res) {
        if (index == arr.size()) {
            if (total == k) {
                res.add(new ArrayList<>(cur));
                return;
            }
            return;
        }
        cur.add(arr.get(index));
        dfs(arr, index + 1, total+arr.get(index), k, cur, res);
        cur.remove(cur.size()-1);
        dfs(arr, index + 1, total, k, cur, res);
    }
}