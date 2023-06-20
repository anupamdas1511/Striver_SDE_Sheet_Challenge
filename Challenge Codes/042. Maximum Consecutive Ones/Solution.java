import java.util.ArrayList;

public class Solution {
	public static int longestSubSeg(ArrayList<Integer> arr , int n, int k) {
		// Write your code here.
		int zeroes = 0;
		int i = 0, j = 0;
		int ans = Integer.MIN_VALUE;
		while (j < n) {
			if (arr.get(j)==0) zeroes++;
			while (zeroes > k) {
				if (arr.get(i)==0) zeroes--;
				i++;
			}
			ans = Math.max(ans, j-i+1);
			j++;
		}
		return ans;
	}
}