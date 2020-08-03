package test.guanglianda;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author wyf
 * @create 2020/7/29
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int x = in.nextInt();
        int[] glass = new int[n];
        for (int i = 0; i < n; i++) {
            glass[i] =in.nextInt();
        }
        System.out.println(minHeight(glass, m, x));
    }

    private static int minHeight(int[] glass, int m, int x) {
        PriorityQueue<Integer> glassQueue = new PriorityQueue<>();
        for (int i : glass) {
            glassQueue.offer(i);
        }
        for (int i = 0; i < m; i++) {
            int min = glassQueue.poll();
            glassQueue.offer(min+x);
        }

        return glassQueue.poll();
    }
}
