import java.util.*;

public class Solution {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        // Write your code here.
        Arrays.sort(at);
        Arrays.sort(dt);

        int count = 0, ans = 0;
        int i = 0, j = 0;
        while (i < n) {
            if (at[i] <= dt[j]) {
                count++;
                ans = Math.max(ans, count);
                i++;
            } else {
                count--;
                j++;
            }
        }

        return ans;
    }
}