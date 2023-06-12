import java.util.* ;
import java.io.*; 
public class Solution {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {

	    // Write your code here.
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        for (int i=0;i<n;i++) {
            int a = arr[i];
            if (i > 0 && a == arr[i-1])
                continue;
            int l = i+1;
            int r = n - 1;
            while (l < r) {
                int threeSum = a + arr[l] + arr[r];
                if (threeSum > K)
                    r--;
                else if (threeSum < K) 
                    l++;
                else {
                    res.add(new ArrayList<>(Arrays.asList(a, arr[l], arr[r])));
                    l++;
                    while (arr[l] == arr[l-1] && l < r)
                        l++;
                }
            }
        }
        return res;

	}
}