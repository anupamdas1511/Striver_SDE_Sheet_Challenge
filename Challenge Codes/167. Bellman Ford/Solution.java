import java.util.* ;
import java.io.*; 
public class Solution {
    static int bellmonFord(int n, int m, int src, int dest, ArrayList<ArrayList<Integer>> edges) {
      // Write your code here.
      int[] dist = new int[n+1];
      Arrays.fill(dist, 1000000000);
      dist[src] = 0;
      for (int i=0;i<n-1;i++) {
        for (ArrayList<Integer> edge: edges) {
          int u = edge.get(0);
          int v = edge.get(1);
          int wt = edge.get(2);
          if (dist[u] != 1000000000 && dist[v] > dist[u] + wt) {
            dist[v] = dist[u] + wt;
          }
        }
      }
      return dist[dest];
    }
    
}
