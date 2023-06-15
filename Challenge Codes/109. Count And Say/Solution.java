import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static String writeAsYouSpeak(int n) 
    {
        // Write your code here.
        if (n==1) return "1";
        return sayAndCount(writeAsYouSpeak(n-1));
    }

    private static String sayAndCount(String s) {
        List<Character> list = new ArrayList<>();
        StringBuilder ans = new StringBuilder();
        list.add(s.charAt(0));
        int n = s.length();
        for (int i=1;i<n;i++) {
            char ch = s.charAt(i);
            if (ch == list.get(list.size()-1)) {
                list.add(ch);
            } else {
                ans.append(list.size());
                ans.append(list.get(list.size()-1));
                list.clear();
                list.add(ch);
            }
        }
        ans.append(list.size());
        ans.append(list.get(list.size()-1));
        return ans.toString();
    }
}