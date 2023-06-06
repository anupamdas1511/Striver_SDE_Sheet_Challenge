import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
		// Write your code here.
		ArrayList<ArrayList<Long>> list = new ArrayList<>();
		// First List
		list.add(new ArrayList<>());
		list.get(0).add(1L);
		for (int i=0;i<n-1;i++) {
			ArrayList<Long> temp = new ArrayList<>();
			temp.add(1L);
			ArrayList<Long> lastList = list.get(list.size()-1);
			for (int j=0;j<lastList.size()-1;j++) {
				temp.add(lastList.get(j)+lastList.get(j+1));
			}
			temp.add(1L);
			list.add(temp);
		}
		return list;
	}
}