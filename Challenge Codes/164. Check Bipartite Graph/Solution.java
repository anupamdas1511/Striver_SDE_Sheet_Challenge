import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static boolean isGraphBirpatite(ArrayList<ArrayList<Integer>> edges) {

        // Write your code here
        int v = edges.size();
        int[] sets = new int[v]; // -1: not visited; 0: set1; 1: set2
        Arrays.fill(sets, -1);

        for (int i=0;i<v;i++) {
            for (int j=0;j<v;j++) {
                if (edges.get(i).get(j) == 1)
                    edges.get(j).set(i, 1);
            }
        }

        for (int i=0;i<v;i++) {
            if (sets[i]==-1) {
                sets[i] = 0;
                if (!dfs(edges, v, i, sets))
                    return false;
            }
        }
        return true;
    }

    private static boolean dfs(ArrayList<ArrayList<Integer>> edges,int v, int src, int[] sets) {

        for (int i=0;i<v;i++) {
            if (edges.get(src).get(i) == 1) {
                int neighbor = i;
                if (sets[neighbor] == sets[src])
                    return false;
                if (1-sets[neighbor] == sets[src]) {
                    continue;
                }
                sets[neighbor] = 1 - sets[src];
                if (!dfs(edges, v, neighbor, sets))
                    return false;
            }
        }
        return true;
    }
}