import java.util.*;

public class Solution {

	public static int minTimeToRot(int[][] grid, int n, int m) {
		// Write your code here.
		int count = 0;
        boolean[][] vis = new boolean[n][m];
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                if (grid[i][j] == 0) {
                    vis[i][j] = true;
                }
            }
        }
        Queue<List<Integer>> q = new ArrayDeque<>();
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                if (grid[i][j] == 2) {
                    vis[i][j] = true;
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i); temp.add(j); temp.add(0);
                    q.add(temp);
                }
            }
        }
        while (!q.isEmpty()) {
            List<Integer> curr = q.poll();
            int row = curr.get(0);
            int col = curr.get(1);
            count = curr.get(2);
            vis[row][col] = true;
            row--;
            if (row>=0 && !vis[row][col]) {
                vis[row][col] = true;
                List<Integer> temp = new ArrayList<>();
                temp.add(row); temp.add(col); temp.add(curr.get(2)+1);
                q.add(temp);
            }
            row+=2;
            if (row<n && !vis[row][col]) {
                vis[row][col] = true;
                List<Integer> temp = new ArrayList<>();
                temp.add(row); temp.add(col); temp.add(curr.get(2)+1);
                q.add(temp);
            }
            row--; col--;
            if (col>=0 && !vis[row][col]) {
                vis[row][col] = true;
                List<Integer> temp = new ArrayList<>();
                temp.add(row); temp.add(col); temp.add(curr.get(2)+1);
                q.add(temp);
            }
            col+=2;
            if (col<m && !vis[row][col]) {
                vis[row][col] = true;
                List<Integer> temp = new ArrayList<>();
                temp.add(row); temp.add(col); temp.add(curr.get(2)+1);
                q.add(temp);
            }
        }
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                if (!vis[i][j]) return -1;
            }
        }
        return count;
	}

}