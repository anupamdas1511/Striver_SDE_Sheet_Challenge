public class Solution {
	public static int cutRod(int price[], int n) {
		// Write your code here.
        int[] dp = new int[n+1];
        dp[0] = 0;
        
        for (int i=1;i<=n;i++) {
            int max = Integer.MIN_VALUE;
            for (int j=0;j<i;j++) {
                max = Math.max(max, price[j] + dp[i-j-1]);
            }
            dp[i] = max;
        }
        return dp[n];
	}
}