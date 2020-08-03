package test.yuanfudao;

import java.util.Scanner;

/**
 * @author wyf
 * @create 2020/8/1
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] course = new int[n][2];
        for (int i = 0; i < n; i++) {
            course[i][0] = sc.nextInt();
            course[i][1] = sc.nextInt();
        }
        System.out.println();
    }


}
