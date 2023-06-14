import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getTrappedWater(long[] arr, int n) {
        // Write your code here.
        long result = 0;
        int left = 0, right = n-1;
        long leftMax = 0, rightMax = 0;
        while (left < right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] > leftMax) {
                    leftMax = arr[left];
                } else {
                    result += Math.min(leftMax, arr[right]) - arr[left];
                }
                left++;
            } else {
                if (arr[right] > rightMax) {
                    rightMax = arr[right];
                } else {
                    result += Math.min(rightMax, arr[left]) - arr[right];
                }
                right--;
            }
        }
        return result;
    }
}
