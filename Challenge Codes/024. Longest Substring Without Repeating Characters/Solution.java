import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String s) 
    {
		//write your code here
		if(s.length() < 2) return s.length();
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int ans = 1;
        for(int i=0;i<n-1;i++) {
            int temp = 1;
            set.clear();
            set.add(s.charAt(i));
            for(int j=i+1;j<n;j++) {
                if(set.contains(s.charAt(j))) break;
                set.add(s.charAt(j));
                temp++;
            }
            ans = Math.max(ans, temp);
        }
        return ans;
	}
}
