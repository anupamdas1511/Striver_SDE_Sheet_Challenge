import java.util.* ;
import java.io.*; 
public class Solution
{
public static int findMinimumCoins(int amount)
    {
        // Write your code here.
        int[] coins = {1000,500,100,50,20,10,5,2,1};
        int res = 0;
        for (int i=0;i<9;i++) {
            if (amount >= coins[i]) {
                int n = amount / coins[i];
                amount = amount - n*coins[i];
                res += n;
            }
        }
        return res;
    }
}