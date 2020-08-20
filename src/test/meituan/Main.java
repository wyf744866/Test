package test.meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author wyf
 * @create 2020/8/15
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseCount(n);
    }

    private static void reverseCount(int n) {
        int count = 0;
        List<int[]> nums = new ArrayList<>();
        for (int i = 1; i <= n / 4; i++) {
            if (i * 4 <= n && isReverse(i, i * 4)) {
                count++;
                nums.add(new int[]{i, i * 4});
            }
        }
        if (count == 0) {
            System.out.println(0);
        } else {
            System.out.println(count);
            for (int i = 0; i < count; i++) {
                System.out.print(nums.get(i)[0]);
                System.out.print(" ");
                System.out.print(nums.get(i)[1]);
                System.out.println();
            }
        }
    }

    private static boolean isReverse(int a, int b) {
        int c = a;
        int d = 1;
        int rev = 0;
        while (c / 10 != 0) {
            d *= 10;
            c = c / 10;
        }
        while (a != 0) {
            rev += a % 10 * d;
            a = a / 10;
            d /= 10;
        }


        return rev == b;
    }
}
