import java.util.*;
import java.util.HashSet;

public class Solution {
    public static ArrayList<ArrayList<Integer>> solveNQueens(int n) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int[][] board = new int[n][n];
        Set<Integer> cols = new HashSet<>();
        Set<Integer> posDiag = new HashSet<>(); // r+c
        Set<Integer> negDiag = new HashSet<>(); // r-c
        solve(board, result, 0, n, cols, posDiag, negDiag);
        return result;
    }

    private static void solve(int[][] board, ArrayList<ArrayList<Integer>> result, int row, int n, Set<Integer> cols, Set<Integer> posDiag, Set<Integer> negDiag) {
        if (row == n) {
            addToResult(board, result, n);
            return;
        }
        for (int col=0;col<n;col++) {
            if (isSafe(cols, posDiag, negDiag, row, col)) {
                board[row][col] = 1;
                cols.add(col);
                posDiag.add(row+col);
                negDiag.add(row-col);

                solve(board, result, row+1, n, cols, posDiag, negDiag);

                board[row][col] = 0;
                cols.remove(col);
                posDiag.remove(row+col);
                negDiag.remove(row-col);
            }
        }
    }

    private static void addToResult(int[][] board, ArrayList<ArrayList<Integer>> result, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                list.add(board[i][j]);
            }
        }
        result.add(list);
    }

    private static boolean isSafe(Set<Integer> cols, Set<Integer> posDiag, Set<Integer> negDiag, int row, int col) {
        return !cols.contains(col) && !negDiag.contains(row-col) && !posDiag.contains(row+col);
    }
}