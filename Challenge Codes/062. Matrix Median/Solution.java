import java.util.*;

public class Solution
{
	public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
	{
		// Write your code here.
		int n = matrix.size();
		int m = matrix.get(0).size();

		ArrayList<Integer> list = new ArrayList<>();
		for (ArrayList<Integer> arr: matrix) {
			for (int num: arr) {
				list.add(num);
			}
		}

		Collections.sort(list);

		int mid = list.size() / 2;
		int median;
		if (list.size() % 2 == 0) {
			median = (list.get(mid-1) + list.get(mid)) / 2;
		} else {
			median = list.get(mid);
		}
	
		return median;
	}
}