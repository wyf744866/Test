package test.meituan;

import java.util.Scanner;

/**
 * @author wyf
 * @create 2020/8/15
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] city = new String[n][2];
        for (int i = 0; i < n; i++) {
            city[i][0] = sc.next();
            city[i][1] = sc.next();
        }
        System.out.println(trailTimes(city));
    }

    private static int trailTimes(String[][] city) {
        if (city == null) return 0;
        int len = city.length;
        int times = 0;
        String begin = city[0][0];
        for (int i = 0; i < len; i++) {
            if (city[i][1].equals(begin)) {
                times++;
                if (i + 1 < len) {
                    begin = city[i + 1][0];
                }
            }
        }
        return times;
    }
}
