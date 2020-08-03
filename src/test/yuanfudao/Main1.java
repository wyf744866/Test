package test.yuanfudao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author wyf
 * @create 2020/8/1
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] temp = new int[n][2];
        for (int i = 0; i < n; i++) {
            temp[i][0] = sc.nextInt();
            temp[i][1] = sc.nextInt();
        }
        System.out.println(maxNum(temp));
    }

    private static int maxNum(int[][] temp) {
        int n = temp.length;
        int max = 0;
        Map<Integer, Integer> ff = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (temp[i][1] == 0) {
                ff.put(i + 2, temp[i][0]);

            } else if (!ff.containsKey(temp[i][1])) {
                ff.put(temp[i][1], temp[i][0]);
            } else {
                int a = ff.get(temp[i][1]);
                if (temp[i][0] > 0) ff.put(temp[i][1], a + temp[i][0]);
            }
        }
        for (Map.Entry<Integer, Integer> entry : ff.entrySet()) {
            max = Math.max(max, entry.getValue());
        }
        return max % 1000000003;
    }
}
