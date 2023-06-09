import java.util.ArrayList;

public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		int curIndex = 0;
		for (int index = 1;index<n;index++) {
			if (!arr.get(index).equals(arr.get(curIndex))) {
				arr.set(curIndex+1, arr.get(index));
				curIndex++;
			}
		}
		return curIndex + 1;
	}
}