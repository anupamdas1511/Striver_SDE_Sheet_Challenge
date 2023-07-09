import java.util.*;

public class Solution {

	public static long countWaysToMakeChange(int denominations[], int value){
        //write your code here			
		long[][] dp = new long[denominations.length+1][value+1];
        for (long[] arr: dp) Arrays.fill(arr, -1);
        return dfs(denominations, 0, value, 0, dp);
	}

	private static long dfs(int[] coins, int index, int sum, int total, long[][] dp) {
        if (sum == total) {
            return dp[index][total] = 1;
        }
        if (index >= coins.length || total > sum) {
            return 0;
        }
        
        if (dp[index][total] != -1) {
            return dp[index][total];
        }
        
        long totalWays = 0;
        totalWays += dfs(coins, index, sum, total + coins[index], dp);
        totalWays += dfs(coins, index+1, sum, total, dp);
        return dp[index][total] = totalWays;
    }
	
}