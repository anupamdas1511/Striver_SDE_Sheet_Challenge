import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public static ArrayList<Integer> findSpans(ArrayList<Integer> price) {
        // Write your code here.
        ArrayList<Integer> ans = new ArrayList<>(Arrays.asList(new Integer[price.size()]));
        Collections.fill(ans, 0);
        ans.set(0, 1);
        for (int i=1;i<price.size();i++) {
            int count = 1;
            while ((i - count) >= 0
                   && price.get(i) >= price.get(i - count)) {
                count += ans.get(i - count);
            }
            ans.set(i, count);
        }
        return ans;
    }
}