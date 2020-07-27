package testforday5;

/**
 * @author wyf
 * @create 2020/7/23
 */
public class Test64_3 {
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] dp = new int[n];
        dp[0] = grid[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j > 0 && i == 0) {
                    dp[j] = dp[j - 1] + grid[i][j];
                } else if (i > 0 && j == 0) {
                    dp[j] += grid[i][j];
                } else if (j > 0) {
                    dp[j] = Math.min(dp[j - 1], dp[j]) + grid[i][j];
                }
            }
        }
        return dp[n - 1];
    }

}
