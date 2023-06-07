import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
		Arrays.sort(arr);
		Map<Integer, Integer> map = new HashMap<>();
		for (int num: arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		int max = 0, res = -1;;
		for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				if (max > n/2) res = entry.getKey();
				else res = -1;
			}
		}
		return res;
	}
}