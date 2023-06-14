import java.util.* ;
import java.io.*; 
public class Solution {

	public static int[] KMostFrequent(int n, int k, int[] arr) {
		// Write your code here.
		int[] result = new int[k];
		Map<Integer, Integer> map = new HashMap<>();
		for (int num: arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		int[][] pairs = new int[map.size()][2];
		int index = 0;
		for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
			pairs[index][0] = entry.getKey();
			pairs[index][1] = entry.getValue();
			index++;
		}
		Arrays.sort(pairs, Comparator.comparingInt(a -> -a[1]));
		index = 0;
		while (k-->0) {
			result[index] = pairs[index][0];
			index++;
		}
		return result;
	}

}