package test.tengxun;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author wyf
 * @create 2020/8/23
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(numKs(s, k));
//        System.out.println(compareStr("aa", "ab"));
//        String s = "acadssa";
//        System.out.println(s.substring(0,2));
    }

    private static String numKs(String s, int k) {
        int len = s.length();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(k,new Comparator<String>() {
            @Override
            //最大堆；
            public int compare(String o1, String o2) {
                return compareStr(o1, o2);
            }
        });
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                if (priorityQueue.size() != k) {
                    priorityQueue.add(s.substring(i, j));
                } else {
                    String s1 = priorityQueue.peek();
                    if (compareStr(s1, s.substring(i, j)) < 0){ //有重复子串
                        priorityQueue.poll();
                        priorityQueue.offer(s.substring(i, j));
                    }
                }
            }
        }
        return priorityQueue.peek();
    }

    private static int compareStr(String o1, String o2) {
        int len1 = o1.length();
        int len2 = o2.length();
        int i = 0, j = 0;
        while (i < len1 && j < len2) {
            if (o1.charAt(i) - o2.charAt(j) > 0) {
                return -1;
            } else if (o1.charAt(i) - o2.charAt(j) < 0) {
                return 1;
            } else {
                i++;
                j++;
                continue;
            }
        }
        if (len1 < len2) return 1;
        if (len2 < len1) return -1;
        return 0;
    }
}
