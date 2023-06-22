import java.io.*;
import java.util.* ;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        int count = 1, result = count;
        Arrays.sort(arr);
        for (int i=1;i<N;i++) {
            if (arr[i]==arr[i-1]) continue;
            if (arr[i]-arr[i-1]==1) count++;
            else {
                result = Math.max(result, count);
                count = 1;
            }
        }
        result = Math.max(result, count);
        return result;
    }
}