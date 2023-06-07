import java.util.*;

public class Solution 
{
	public static String reverseString(String str) 
	{
		//Write your code here
		ArrayList<String> list = new ArrayList<>();
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i) != ' ') {
				StringBuilder sb = new StringBuilder();
				while (i<str.length() && str.charAt(i) != ' ') {
					sb.append(str.charAt(i));
					i++;
				}
				list.add(sb.toString());
			}
		}
		Collections.reverse(list);
		StringBuilder res = new StringBuilder();
		for (int i=0;i<list.size();i++) {
			res.append(list.get(i));
			if (i+1 != list.size()) res.append(" ");
		}
		return res.toString();
	}
}