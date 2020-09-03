package test.tengxun;

import java.util.Scanner;

/**
 * @author wyf
 * @create 2020/8/23
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        int[][] nums = new int[n][2];
        for (int i = 0; i < n; i++) {
            nums[i][0] = sc.nextInt();
            nums[i][1] = sc.nextInt();
        }
        int[] results = subStr(s,nums);
        for (int result : results) {
            System.out.println(result);
        }
    }

    private static int[] subStr(String s, int[][] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = minStr(s.substring(nums[i][0]-1,nums[i][1]));
        }
        return result;
    }

    private static int minStr(String s) {
        int len = s.length();
        int[] dp = new int[len];
        boolean[][] isStr = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i] = i+1;
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == j) {
                    isStr[i][j] = true;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                if (s.charAt(i) == s.charAt(j) && (i -j <2||isStr[j+1][i-1] == true )){
                    isStr[j][i] = true;
                    if (j == 0){
                        dp[i] = 1;
                        break;
                    }else {
                        dp[i] = Math.min(dp[i],dp[j-1]+1);

                    }
                }
            }
        }

        return dp[len-1];
    }
}
