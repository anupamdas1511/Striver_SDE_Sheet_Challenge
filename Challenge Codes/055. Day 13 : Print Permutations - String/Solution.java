import java.util.* ;
import java.io.*; 
public class Solution {
    public static List<String> findPermutations(String s) {
        // Write your code here.
        List<String> res = new ArrayList<>();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        solve(arr, 0, res);
        return res;
    }

    private static void solve(char[] arr, int start, List<String> res) {
        if (start == arr.length) {
            res.add(new String(arr));
        }

        for (int i=start;i<arr.length;i++) {
            swap(arr, start, i);
            solve(arr, start+1, res);
            swap(arr, start, i);
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}