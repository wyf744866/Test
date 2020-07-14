package testforday4;

/**
 * @author wyf
 * @create 2020/7/12
 */
public class Test174 {
    //有后效性
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length, n = dungeon[0].length;
//        dp[i][j] 表示到达该点至少需要的健康点数
        int[][] dp = new int[m][n];
        int[][] life = new int[m][n];
        for (int i = 0; i < m; i++) {
            life[i][0] = i > 0 ? dungeon[i][0] + life[i - 1][0] : dungeon[i][0];
            int temp = i > 0 ? life[i - 1][0] : 0;
            if (life[i][0] < 0 && life[i][0] < temp) {
                dp[i][0] = -life[i][0] + 1;
            } else {
                dp[i][0] = i > 0 ? dp[i - 1][0] : 1;
            }
        }
        for (int i = 1; i < n; i++) {
            life[0][i] = dungeon[0][i] + life[0][i - 1];
            if (life[0][i] < 0 && life[0][i] < life[0][i - 1]) {
                dp[0][i] = -life[0][i] + 1;
            } else {
                dp[0][i] = dp[0][i - 1];
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
//                int temp1 = dungeon[i][j] + life[i - 1][j];
//                int temp2 = dungeon[i][j] + life[i][j - 1];
//                int life1 = 0;
//                int life2 = 0;
//                if (temp1 < 0 && temp1 < life[i - 1][j]) {
//                    life1 = -temp1 + 1;
//                } else {
//                    life1 = dp[i - 1][j];
//                }
//                if (temp2 < 0 && temp1 < life[i][j-1]) {
//                    life2 = -temp2 + 1;
//                } else {
//                    life2 = dp[i][j - 1];
//                }
//                if (life1 < life2) {
//                    dp[i][j] = life1;
//                    life[i][j] = temp1;
//                } else if (life1 > life2) {
//                    dp[i][j] = life2;
//                    life[i][j] = temp2;
//                } else {
//                    dp[i][j] = life2;
//                    life[i][j] = Math.max(temp1, temp2);
//                }
                if (dungeon[i][j] < 0 ){
                    dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]) -dungeon[i][j];

                }else {
                    dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1]);
                }

                if (dp[i-1][j]<dp[i][j-1]){
                    life[i][j] = life[i-1][j] + dungeon[i][j];
                }else {
                    life[i][j] = life[i][j-1] + dungeon[i][j];
                }

            }
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Test174 t = new Test174();
        int[][] nums = {{-2,-3,3},{-5,-10,1},{10,30,-5}};
//        int[][] nums = {{-1, 1}};
        System.out.println(t.calculateMinimumHP(nums));
    }
}
