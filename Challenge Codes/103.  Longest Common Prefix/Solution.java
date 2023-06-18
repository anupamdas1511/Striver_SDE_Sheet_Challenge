
public class Solution {
	public static String longestCommonPrefix(String[] arr, int n) {
		// Write your code here
		if (n == 1) return arr[0];
        String ans = arr[0];
        for (int i=1;i<n;i++) {
            ans = lcp(ans, arr[i]);
        }
        return ans;
	}

	private static String lcp(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i=0, n1 = a.length(), n2 = b.length();
        while(i<n1 && i<n2 && a.charAt(i)==b.charAt(i)) {
            sb.append(a.charAt(i));
            i++;
        }
        return sb.toString();
    }

}