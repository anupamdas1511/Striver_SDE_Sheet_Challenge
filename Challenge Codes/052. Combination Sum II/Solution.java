import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target)
    {
        //    Write your code here.
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Collections.sort(arr);
        dfs(0, new ArrayList<>(), 0, arr, target, res);
        return res;
    }

    private static void dfs(int i, ArrayList<Integer> cur, int total, ArrayList<Integer> arr, int target, ArrayList<ArrayList<Integer>> res) {
        if (total == target) {
            res.add(new ArrayList<>(cur));
            return;
        }
        if (i >= arr.size() || total > target) {
            return;
        }

        cur.add(arr.get(i));
        dfs(i+1, cur, total + arr.get(i), arr, target, res);
        cur.remove(cur.size() - 1);
        int j=i;
        while (j<arr.size() && arr.get(j) == arr.get(i)) j++;
        dfs(j, cur, total, arr, target, res);
    }
}