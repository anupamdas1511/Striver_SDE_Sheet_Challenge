import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int[] merged = new int[m+n];
        int index = 0;
        int i = 0, j = 0;
        while (i<m || j<n) {
            int first = (i<m) ? arr1[i] : Integer.MAX_VALUE;
            int second = (j<n) ? arr2[j] : Integer.MAX_VALUE;
            if (first < second) {
                merged[index++] = first;
                i++;
            } else {
                merged[index++] = second;
                j++;
            }
        }
        return merged;
    }
}