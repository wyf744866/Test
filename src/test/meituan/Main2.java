package test.meituan;

import java.util.*;

/**
 * @author wyf
 * @create 2020/8/15
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] orders = new int[m][2];
        for (int i = 0; i < m; i++) {
            orders[i][0] = sc.nextInt();
            orders[i][1] = sc.nextInt();
        }
        regions(orders,n);
    }

    private static void regions(int[][] orders,int n) {
        int m = orders.length;
        List<TreeSet<Integer>> areas = new ArrayList<>();
        areas.add(new TreeSet<>());
        areas.get(0).add(orders[0][0]);
        areas.get(0).add(orders[0][1]);
        boolean flag = true;
        for (int i = 1; i < m; i++) {
            for (int k = 0; k < areas.size(); k++) {
                if (areas.get(k).contains(orders[i][1])){
                    areas.get(k).add(orders[i][0]);
                    flag = false;
                }
            }
            if (flag){
                TreeSet<Integer> treeSet = new TreeSet<>();
                treeSet.add(orders[i][0]);
                treeSet.add(orders[i][1]);
                areas.add(treeSet);
                flag = true;
            }
        }
        System.out.println(areas.size());
        for (int i = 0; i < areas.size(); i++) {
            for (Integer order : areas.get(0)) {
                System.out.print(order);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
