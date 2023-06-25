import java.util.*;
public class Solution {

	public static int lcs(String s, String t) {
		//Your code goes here
		int n = s.length();
        int m = t.length();
        int[][] dp = new int[s.length()+1][t.length()+1];

        for (int[] arr: dp) Arrays.fill(arr, -1);

        // i == n
        for (int j=0;j<=m;j++) dp[n][j] = 0;
        // j == m
        for (int i=0;i<=n;i++) dp[i][m] = 0;

        for (int i=n-1;i>=0;i--) {
            for (int j=m-1;j>=0;j--) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i][j] = 1 + dp[i+1][j+1];
                } else {
                    dp[i][j] = Math.max(dp[i][j+1], dp[i+1][j]);
                }
            }
        }

        return dp[0][0];
    }

}