import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		if (n == 0) return 0;
        long max = Long.MIN_VALUE;
        long canBeMax = 0;
        for (int i=0;i<n;i++) {
            canBeMax += arr[i];
            if(canBeMax > max) max = canBeMax;
            if(canBeMax < 0) canBeMax = 0;
        }
        return Math.max(0, max);
	}

}