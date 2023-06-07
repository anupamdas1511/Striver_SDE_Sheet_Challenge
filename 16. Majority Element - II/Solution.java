import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        Collections.sort(arr);
		Map<Integer, Integer> map = new HashMap<>();
		for (Integer num: arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		int max = 0, n = arr.size();
        ArrayList<Integer> result = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() > n/3) {
                result.add(entry.getKey());
            }
		}
		return result;
    }
}