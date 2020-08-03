package test.pingduoduo;

import java.util.Scanner;

/**
 * @author wyf
 * @create 2020/8/2
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        canEnd(nums, k);
    }

    private static void canEnd(int[] nums, int k) {
        int n = nums.length;
        if (k == 0) {
            System.out.println("paradox");
            return;
        }
        int distance = k;
        int backTimes = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == distance) {
                System.out.println("paradox");
                return;
            } else if (nums[i] > distance) {
                distance = nums[i] - distance;
                backTimes++;
            } else {
                distance = distance - nums[i];
            }
        }
        System.out.print(distance);
        System.out.print(" ");
        System.out.print(backTimes);
    }
}
