public class Solution 
{
    public static int getTotalIslands(int[][] grid) 
	{
        //Your code goes here
        int res = 0;
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                if (grid[i][j] == 0) {
                    vis[i][j] = true;
                }
            }
        }
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                if (!vis[i][j]) {
                    res++;
                    dfs(grid, vis, i, j, n, m);
                }
            }
        }
        return res;
    }

    private static void dfs(int[][] grid, boolean[][] vis, int row, int col, int n, int m) {
        vis[row][col] = true;
        int[][] dirs = {{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1},{-1,0},{-1,1}};
        for (int[] dir: dirs) {
            int i = row + dir[0];
            int j = col + dir[1];
            if (i>=0 && i<n && j>=0 && j<m && !vis[i][j]) {
                dfs(grid, vis, i, j, n, m);
            }
        }
    }
}