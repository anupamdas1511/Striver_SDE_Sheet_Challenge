import java.io.*;
import java.util.* ;

public class Solution {
  public static String fourSum(int[] arr, int target, int n) {
      // Write your code here.
      if (n < 4) {
          return "No";
      }
      Arrays.sort(arr);
      for (int i=0;i<n;i++) {
          int first = arr[i];
          if (i > 0 && first == arr[i-1])
              continue;
          for (int j=i+1;j<n;j++) {
              int second = arr[j];
              if (j > i+1 && second == arr[j-1])
                  continue;
              int l = j+1;
              int r = n - 1;
              while (l < r) {
                  long fourSum = (long)first + (long)second + (long)arr[l] + (long)arr[r];
                  if (fourSum > (long)target) {
                      r--;
                  } else if (fourSum < (long)target) {
                      l++;
                  } else {
                      if (fourSum > Integer.MAX_VALUE) {
                          continue;
                      }
                      if (fourSum < Integer.MIN_VALUE) {
                          continue;
                      }
                      return "Yes";
                  }
              }
          }
      }
      return "No";
  }
}