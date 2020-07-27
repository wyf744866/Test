package testforday5;

/**
 * @author wyf
 * @create 2020/7/23
 */
public class Test62 {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        dp[0] = 1 ;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0){
                    dp[j] = 1;
                }else {
                    dp[j] = dp[j] + dp[j-1];
                }
            }
        }

        return dp[n-1];
    }
}
