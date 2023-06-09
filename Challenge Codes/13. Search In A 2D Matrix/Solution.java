import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> matrix, int target) {
        // Write your code here.
        int row = matrix.size();
        int col = matrix.get(0).size();

        int low = 0;
        int high = row*col - 1;

        while (low <= high) {
            int mid = (low+high)/2;
            int element = matrix.get(mid/col).get(mid%col);

            if (element == target) {
                return true;
            }
            if (element < target) {
                low = mid + 1;
            }
            if (element > target) {
                high = mid - 1;
            }
        }
        return false;
    }
}