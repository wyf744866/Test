package test.aiqiyi;

import java.util.Scanner;

/**
 * @author wyf
 * @create 2020/8/23
 */
public class Main_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(CountZero(n));
    }

    private static int CountZero(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 10 == 0) {
                int temp = i;
                while (temp % 10 == 0) {
                    count++;
                    temp = temp / 10;
                }
            }
            if (i % 5 == 0 && i % 10 != 0) {
                int temp = i;
                int a = 2;
                int level = 10;
                while (a <= n) {
                    if (a * temp % level == 0) {
                        count++;
                    }
                    a = a * 2;
                    level *= 10;
                }
            }

        }
        return count;
    }

}

