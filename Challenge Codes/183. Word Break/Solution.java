import java.util.* ;
import java.io.*; 
public class Solution {
    public static Boolean wordBreak(String[] arr, int n, String s) {
        // Write your code here.
        Set<String> set = new HashSet<>();
        for (String str : arr) set.add(str);
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[s.length()];
        queue.add(0);
        while(!queue.isEmpty()) {
            int start = queue.remove();
            if (visited[start]) {
                continue;
            }
            for (int end = start + 1; end <= s.length(); end++) {
                if (set.contains(s.substring(start, end))) {
                    queue.add(end);
                    if (end == s.length()) {
                        return true;
                    }
                }
            }
            visited[start] = true;
        }
        return false;
    }
}