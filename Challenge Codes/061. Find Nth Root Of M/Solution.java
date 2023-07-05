public class Solution {
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int low = 1, high = m;
        while (low <= high) {
            int mid = (low+high) >>> 1;
            int pow = (int)Math.pow(mid, n);
            if (pow > m) {
                high = mid - 1;
            } else if (pow < m) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
