import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        return sort(arr, 0, arr.length-1);
    }

    private static long sort(long[] arr, int left, int right) {
        long count = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;
            count += sort(arr, left, mid);
            count += sort(arr, mid+1, right);
            count += solveAndMerge(arr, left, mid, right);
        }
        return count;
    }
    
    private static long solveAndMerge(long[] arr, int left, int mid, int right) {
        
        // merge algorithm
        long[] L = Arrays.copyOfRange(arr, left, mid+1);
        long[] R = Arrays.copyOfRange(arr, mid+1, right+1);
        
        int i = 0, j =0;
        int k = left;
        long res = 0;
        while (i < L.length && j < R.length) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
                // solve algorithm
                res += (mid+1) - (left+i);
            }
        }
        
        while (i < L.length)
            arr[k++] = L[i++];
        
        while (j < R.length) 
            arr[k++] = R[j++];
        
        return res;
    }
}