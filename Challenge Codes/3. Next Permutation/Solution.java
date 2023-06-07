import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
        int first = -1;
        int second = 0;
        for (int i=permutation.size()-2;i>=0;i--) {
            if (permutation.get(i) < permutation.get(i+1)) {
                first = i;
                break;
            }
        }
        if (first!=-1) {
            for (int i=first+1;i<permutation.size();i++) {
                if (permutation.get(i) <= permutation.get(first)) {
                    second = i-1;
                    break;
                } else {
                    second = i;
                }
            }
			Collections.swap(permutation, first, second);
        }
		Collections.reverse(permutation.subList(first+1, permutation.size()));
		return permutation;
	}
}