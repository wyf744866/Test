package test.yuanfudao;

import java.util.Scanner;

/**
 * @author wyf
 * @create 2020/8/1
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] course = new int[n][2];
        for (int i = 0; i < n; i++) {
            course[i][0] = sc.nextInt();
            course[i][1] = sc.nextInt();
        }
        System.out.println(maxUse(course));
    }

    private static int maxUse(int[][] course) {
        int max = 1;
        int n = course.length;
        int start = Integer.MAX_VALUE, end = -1;
        for (int i = 0; i < n; i++) {
            start = Math.min(start, course[i][0]);
            end = Math.max(end, course[i][1]);
        }

        while (start < end) {
            int temp = 0;

            for (int i = 0; i < n; i++) {
                if (start >= course[i][0] && start < course[i][1]) temp++;
            }
            start++;
            max = Math.max(max, temp);
        }
        return max ;
    }
}
