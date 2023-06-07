import java.io.*;
import java.util.*;

import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
		int res = 0;
		for (int i=0;i<arr.size();i++) {
			int sum = arr.get(i);
			if (sum==0) res = Math.max(res, 1);
			for (int j=i+1;j<arr.size();j++) {
				sum += arr.get(j);
				if (sum==0) {
					res = Math.max(res, j-i+1);
				}
			}
		}
		return res;
	}
}