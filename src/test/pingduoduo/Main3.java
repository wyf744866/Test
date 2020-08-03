package test.pingduoduo;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author wyf
 * @create 2020/8/2
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        int[][] breakfast = new int[n][2];
        int[][] dinner = new int[m][2];
        for (int i = 0; i < n; i++) {
            breakfast[i][0] = sc.nextInt();
            breakfast[i][1] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            dinner[i][0] = sc.nextInt();
            dinner[i][1] = sc.nextInt();
        }
        System.out.println(minEnager(breakfast, dinner, t));
    }

    private static int minEnager(int[][] breakfast, int[][] dinner, int t) {
        if (t == 0) return 0;
        int min = Integer.MAX_VALUE;
        int n = breakfast.length;
        int m = dinner.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (breakfast[i][1] >= t) {
                    min = Math.min(min, breakfast[i][0]);
                } else if (breakfast[i][1] + dinner[j][1] >= t) {
                    min = Math.min(min, breakfast[i][0] + dinner[j][0]);
                }
            }
        }
        for (int i = 0; i < m; i++) {
            if (dinner[i][1] >= t){
                min = Math.min(dinner[i][0],min);
            }
        }


        return min;
    }
}
