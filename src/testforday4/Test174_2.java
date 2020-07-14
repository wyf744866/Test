package testforday4;

import java.util.Arrays;

/**
 * @author wyf
 * @create 2020/7/12
 */
public class Test174_2 {
//    dp[i][j]表示从坐标 (i,j)到终点所需的最小初始值
    public int calculateMinimumHP(int[][] dungeon) {
        int n = dungeon.length, m = dungeon[0].length;
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; ++i) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        dp[n][m - 1] = dp[n - 1][m] = 1;
        for (int i = n - 1; i >= 0; --i) {
            for (int j = m - 1; j >= 0; --j) {
                int minn = Math.min(dp[i + 1][j], dp[i][j + 1]);
                dp[i][j] = Math.max(minn - dungeon[i][j], 1);
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        Test174_2 t = new Test174_2();
        int[][] nums = {{-2,-3,3},{-5,-10,1},{10,30,-5}};
        System.out.println(t.calculateMinimumHP(nums));
    }

}
