import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Pair class:

        class Pair
        {
        	int weight;
	        int value;
	        Pair(int weight, int value)
	        {
		        this.weight = weight;
		        this.value = value;
	        }
	        
        }
        
*****************************************************************/


public class Solution {
    public static double maximumValue(Pair[] items, int n, int w) {
		// Write your code here.
		// ITEMS contains {weight, value} pairs.
		Arrays.sort(items, Comparator.comparingDouble(a -> ((double) a.value / a.weight)));
		double res = 0.0;
		for (int i=n-1;i>=0;i--) {
			Pair p = items[i];
			if (w != 0) {
				if (p.weight <= w) {
					res += p.value;
					w -= p.weight;
				} else {
					res += w * ((double)p.value / p.weight);
					break;
				}
			}
		}
		return res;
    }
}
