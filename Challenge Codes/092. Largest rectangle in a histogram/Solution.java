import java.util.ArrayList;

public class Solution {
  public static int largestRectangle(ArrayList < Integer > height) {
    // Write your code here.
    if (height == null || height.size() == 0) {
        return 0;
    }
    int n = height.size();
    int[] lessFromLeft = new int[n];
    int[] lessFromRight = new int[n]; 
    lessFromRight[n - 1] = n;
    lessFromLeft[0] = -1;

    for (int i = 1; i < n; i++) {
        int p = i - 1;

        while (p >= 0 && height.get(p) >= height.get(i)) {
            p = lessFromLeft[p];
        }
        lessFromLeft[i] = p;
    }

    for (int i = n - 2; i >= 0; i--) {
        int p = i + 1;

        while (p < n && height.get(p) >= height.get(i)) {
            p = lessFromRight[p];
        }
        lessFromRight[i] = p;
    }

    int maxArea = 0;
    for (int i = 0; i < n; i++) {
        maxArea = Math.max(maxArea, height.get(i) * (lessFromRight[i] - lessFromLeft[i] - 1));
    }

    return maxArea;
  }
}