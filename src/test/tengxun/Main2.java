package test.tengxun;

import java.util.Scanner;

/**
 * @author wyf
 * @create 2020/8/23
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] results = maxVals(nums);
        for (int result : results) {
            System.out.print(result);
            System.out.print(" ");
        }
    }

    private static int[] maxVals(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = maxVal(nums[i]);
        }
        return nums;
    }

    private static int maxVal(int num) {
        int val = 0;
        for (int i = 0; i <= num / 2; i++) {
            int sx = snum(i);
            int sy = snum(num - i);
            val = Math.max(val,sx+sy);
        }
        return val;
    }

    private static int snum(int a) {
        int result = 0;
        while (a != 0) {
            result += a % 10;
            a = a/10;
        }
        return result;

    }
}
