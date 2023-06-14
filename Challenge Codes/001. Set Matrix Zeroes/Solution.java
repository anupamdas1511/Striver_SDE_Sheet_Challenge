import java.io.*;
import java.util.* ;

public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();

        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[0].length;j++) {
                if (matrix[i][j] == 0) {
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }
        for (int num: rowSet) {
            makeRowZero(matrix, num);
        }
        for (int num: colSet) {
            makeColZero(matrix, num);
        }
    }

    private static void makeColZero(int[][] matrix, int col) {
        for (int i=0;i<matrix.length;i++) {
            if (matrix[i][col] != 0) {
                matrix[i][col] = 0;
            }
        }
    }
    private static void makeRowZero(int[][] matrix, int row) {
        for (int i=0;i<matrix[0].length;i++) {
            if (matrix[row][i] != 0) {
                matrix[row][i] = 0;
            }
        }
    }

}