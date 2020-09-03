package test.aiqiyi;

import java.util.Scanner;

/**
 * @author wyf
 * @create 2020/8/23
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(crossPath(s));
    }

    private static String crossPath(String s) {
        int len = s.length();
        int x = len, y = len;
        boolean[][] path = new boolean[len * 2][len * 2];
        for (int i = 0; i < len; i++) {
            int a = 0, b = 0;
            if (s.charAt(i) == 'N') {
                a = 0;
                b = -1;
            } else if (s.charAt(i) == 'S') {
                a = 0;
                b = 1;
            } else if (s.charAt(i) == 'E') {
                a = 1;
                b = 0;
            } else if (s.charAt(i) == 'W') {
                a = -1;
                b = 0;
            }
            x = x + a;
            y = y + b;
            if (path[x][y]) {
                return "True";
            } else {
                path[x][y] = true;
            }

        }
        return "False";

    }
}
