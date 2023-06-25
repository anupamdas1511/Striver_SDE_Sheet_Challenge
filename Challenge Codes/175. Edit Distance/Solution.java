
public class Solution {

    public static int editDistance(String str1, String str2) {
        //Your code goes here

        fillDP(str1, str2);
        return dp[str2.length()][str1.length()];
    }
    private static int dp[][];
    private static void fillDP(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        dp = new int[n2+1][n1+1];
        for(int i=0;i<=n2;i++) {
            dp[i][0] = i;
        }
        for(int j=0;j<=n1;j++) {
            dp[0][j] = j;
        }
        for(int i=1;i<=n2;i++) {
            for(int j=1;j<=n1;j++) {
                if(s1.charAt(j-1) == s2.charAt(i-1)) {
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = 1 + Math.min(dp[i-1][j-1], Math.min(dp[i][j-1], dp[i-1][j]));
                }
            }
        }
    }
}