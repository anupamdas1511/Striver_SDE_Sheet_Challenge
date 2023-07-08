import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int maximumProduct(ArrayList<Integer> arr, int n) {
		// Write your code here.
		int result = arr.get(0);
 
        for (int i = 0; i < n; i++) {
            int mul = arr.get(i);
            for (int j = i + 1; j < n; j++) {
                result = Math.max(result, mul);
                mul *= arr.get(j);
            }
            result = Math.max(result, mul);
        }
        return result;
	}
}