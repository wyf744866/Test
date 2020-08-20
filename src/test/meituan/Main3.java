package test.meituan;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author wyf
 * @create 2020/8/15
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] profits = new int[n][2];
        for (int i = 0; i < n; i++) {
            profits[i][0] = sc.nextInt();
            profits[i][1] = sc.nextInt();
        }
        System.out.println(maxProfits(profits, a, b));
    }

    private static int maxProfits(int[][] profits, int a, int b) {
        PriorityQueue<int[]> maxA = new PriorityQueue<>(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        PriorityQueue<int[]> maxB = new PriorityQueue<>(b, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int n = profits.length;
        for (int i = 0; i < n; i++) {
            if (i < a + b) {
                if (profits[i][0] > profits[i][1] && maxA.size() < a) {
                    maxA.offer(new int[]{profits[i][0], profits[i][1]});
                } else {
                    if (maxB.size() < b) {
                        maxB.offer(new int[]{profits[i][0], profits[i][1]});
                    } else {
                        maxA.offer(new int[]{profits[i][0], profits[i][1]});
                    }
                }
            } else {
                int[] mina = maxA.peek();
                int[] minb = maxB.peek();
                if (profits[i][0] - mina[0] > profits[i][1] - minb[1]) {
                    if (profits[i][0] > mina[0]) {
                        maxA.offer(new int[]{profits[i][0], profits[i][1]});
                        int[] temp = maxA.poll();
                        if (temp[1] > minb[1]) {
                            maxB.offer(temp);
                            maxB.poll();
                        }
                    }
                } else {
                    if (profits[i][1] > minb[1]) {
                        maxB.offer(new int[]{profits[i][0], profits[i][1]});
                        int[] temp = maxB.poll();
                        if (temp[0] > mina[0]) {
                            maxA.offer(temp);
                            maxA.poll();
                        }
                    }
                }
            }
        }
        int max = 0;
        for (int[] a1 : maxA) {
            max += a1[0];
        }
        for (int[] b1 : maxB) {
            max += b1[1];
        }

        return max;
    }
}
