import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static int[] nextGreater(int[] arr, int n) {	
		//Write Your code here
		int[] res = new int[n];
		Arrays.fill(res, -1);
		int max = arr[n-1];
		for (int i=n-2;i>=0;i--) {
			if (arr[i+1] > arr[i]) {
				res[i] = arr[i+1];
			} else {
				if (res[i+1] > arr[i]) {
					res[i] = res[i+1];
				} else if (max > arr[i]) {
					int k = i+1;
					while (arr[k] <= arr[i]) k++;
					res[i] = arr[k];
				} else {
					res[i] = -1;
				}
			}
			max = Math.max(max, arr[i]);
		}
		return res;
	}

}