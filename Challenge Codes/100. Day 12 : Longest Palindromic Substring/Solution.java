public class Solution {	
	public static String longestPalinSubstring(String s) {
		// Write your code here.
		int n = s.length();
        String res = "";
        int len = 0;
        for (int i=0;i<n;i++) {
            int l=i, r=i;
            while (l>=0 && r<n && s.charAt(l)==s.charAt(r)) {
                if (r-l+1 > len) {
                    res = s.substring(l, r+1);
                    len = r-l+1;
                }
                l--; r++;
            }
            l=i; r=i+1;
            while (l>=0 && r<n && s.charAt(l)==s.charAt(r)) {
                if (r-l+1 > len) {
                    res = s.substring(l, r+1);
                    len = r-l+1;
                }
                l--; r++;
            }
        }
        return res;
	}
}
