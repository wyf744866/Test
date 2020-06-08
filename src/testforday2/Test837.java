package testforday2;

/**
 * @author wyf
 * @create 2020/6/3
 */
public class Test837 {
    public double new21Game(int N, int K, int W) {
        /*令 dp[x] 表示从得分为 xx 的情况开始游戏并且获胜的概率，目标是求 dp[0]的值。*/
        if (K == 0) {
            return 1.0;
        }
        double[] dp = new double[K + W + 1];
        for (int i = K; i <= N && i < K + W; i++) {
            dp[i] = 1.0;
        }
        for (int i = K - 1; i >= 0; i--) {
            for (int j = 1; j <= W; j++) {
                dp[i] += dp[i + j] / W;
            }
        }
        return dp[0];
    }



    public static void main(String[] args) {

    }
}
