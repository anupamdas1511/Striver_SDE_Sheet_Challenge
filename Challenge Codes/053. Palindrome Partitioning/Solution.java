import java.util.* ;
import java.io.*; 
public class Solution {
    public static List<List<String>> partition(String s) {
        // Write your code here.
        List<List<String>> list = new ArrayList<>();
        dfs(s, new ArrayList<>(), list, 0);
        return list;
    }

    private static void dfs(String s, List<String> part, List<List<String>> list, int index) {
        if (index >= s.length()) {
            list.add(new ArrayList<>(part));
            return;
        }
        for (int i=index;i<s.length();i++) {
            if (isPalin(s, index, i)) {
                part.add(s.substring(index, i+1));
                dfs(s, part, list, i+1);
                part.remove(part.size()-1);
            }
        }
    }
    private static boolean isPalin(String s, int i, int j) {
        while (i<j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
}