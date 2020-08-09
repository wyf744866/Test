package test.wangyi;

import java.util.Scanner;

/**
 * @author wyf
 * @create 2020/8/8
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(maxNum(nums));
    }

    private static int maxNum(int[] nums) {
        int[] fd = new int[1000];
        fd[0] = 0;
        fd[1] = 1;
        fd[2] = 1;
        int sum = 0;
        for (int i = 3; i < 1000; i++) {
            for (int j = 0; j < i/2; j++) {
                fd[i] = Math.max(fd[i], fd[j] + fd[i - j]);
            }
            if (fd[i] == 0 && isSu(i)) fd[i] = 1;
        }
        for (int i = 0; i < nums.length; i++) {
            sum = fd[nums[i] - 1];
        }
        return sum;
    }

    public static boolean isSu(int n) {
        double s = Math.sqrt(n);
        for (int i = 2; i <= s; i++)
            if (n % i == 0) return false;
        return true;
    }
}
