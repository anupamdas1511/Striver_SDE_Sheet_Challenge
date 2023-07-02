import java.util.* ;
import java.io.*; 
/*
	This is signature of helper function 'knows'.
	You should not implement it, or speculate about its implementation.

	boolean knows(int A, int B); 
	Function 'knows(A, B)' will returns "true" if the person having
	id 'A' know the person having id 'B' in the party, "false" otherwise.
	Use it as Runner.knows(A, B);
*/
class Runner {
    public static boolean knows(int A, int B) {
        // Given in the problem
        return true;
    }
}
	
public class Solution {
	public static int findCelebrity(int n) {
        // Write your code here.
		int first = 0, last = n-1;
    	while (first < last) {
    	    if (Runner.knows(last, first)) {
    	        last--;
    	    } else {
    	        first++;
    	    }
    	}
		
    	int canBeCelebrity = first;
    	
    	for (int person=0;person<n;person++) {
    	    if (person != canBeCelebrity) {
    	        if (!Runner.knows(person, canBeCelebrity) || Runner.knows(canBeCelebrity, person)) {
    	            return -1;
    	        }
    	    }
    	}
    	return canBeCelebrity;
    }
}