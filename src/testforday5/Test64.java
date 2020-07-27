package testforday5;

import java.util.Arrays;

/**
 * @author wyf
 * @create 2020/7/23
 */
public class Test64 {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int m = grid.length;
        int n = grid[0].length;
        int[][] subPath = new int[m][n];
        for (int i = 0; i < m; i++) {

            Arrays.fill(subPath[i],Integer.MAX_VALUE);
        }
        subPath[m-1][n-1] = grid[m-1][n-1];
        for (int i = m-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                if (i + 1 <= m-1){
                    subPath[i][j] = grid[i][j] + subPath[i+1][j];
                }
                if (j + 1 <= n-1){
                    subPath[i][j] = Math.min(subPath[i][j],grid[i][j] + subPath[i][j+1]);
                }
            }
        }
        return subPath[0][0];
    }
}
