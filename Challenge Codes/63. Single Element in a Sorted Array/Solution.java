import java.util.ArrayList;
public class Solution
{
    public static int singleNonDuplicate(ArrayList<Integer> arr)
    {
        //    Write your code here.
        int left = 0; // Left pointer
        int right = arr.size() - 1; // Right pointer

        while (left < right) {
            int mid = left + (right - left) / 2; // Calculate the middle index

            // Check if the middle index is even
            if (mid % 2 == 1) {
                mid--; // Adjust the middle index to be even
            }

            // Check if the middle element is equal to its next element
            if (arr.get(mid) != arr.get(mid + 1)) {
                right = mid; // The single element is on the left side
            } else {
                left = mid + 2; // The single element is on the right side
            }
        }

        return arr.get(left); // Return the single element
    }
}