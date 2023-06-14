public class Solution {
    public static int ninjaAndLadoos(int row1[], int row2[], int m, int n, int k) {
        // Write your code here.
        int i = 0, j = 0, num = -1;
        while (i<m || j<n) {
            int num1 = (i<m) ? row1[i] : Integer.MAX_VALUE;
            int num2 = (j<n) ? row2[j] : Integer.MAX_VALUE;
            if (num1 < num2) {
                num = num1;
                i++;
            } else {
                num = num2;
                j++;
            }
            k--;
            if (k == 0) break;
        }
        return num;
    }
}