package test.didi;

import java.util.Scanner;

/**
 * @author wyf
 * @create 2020/8/21
 */
public class Main2 {
    static long[] nums;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        nums = new long[n * n];
        nums[0] = 1;
        nums[1] = 1;
        for (int i = 2; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        nMatrix(nums, n);
    }

    private static void nMatrix(long[] nums, int n) {
        long[][] matrix = new long[n][n];
        int index = nums.length - 1;
        int begin1 = 0, begin2 = 0, end1 = n - 1, end2 = n - 1;
        int i = 0, j = 0;
        while (begin1 <= end1 && begin2 <= end2) {
            for (; j <= end2; j++) {
                matrix[i][j] = nums[index];
                index--;
            }
            j--;
            i++;
            begin1++;
            for (; i <= end1; i++) {
                matrix[i][j] = nums[index];
                index--;
            }
            end2--;
            j--;
            i--;
            for (; j >= begin2; j--) {
                matrix[i][j] = nums[index];
                index--;
            }
            end1--;
            j++;
            i--;
            for (; i >= begin1; i--) {
                matrix[i][j] = nums[index];
                index--;
            }
            begin2++;
            i++;
            j++;
        }
        for (int k = 0; k < n; k++) {
            long[] temp = matrix[k];
            for (int i1 = 0; i1 < temp.length-1; i1++) {
                System.out.print(temp[i1]);
                System.out.print(" ");
            }
            System.out.print(temp[n-1]);
            System.out.println();
        }

    }
}
