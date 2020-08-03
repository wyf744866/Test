package test.guanglianda;

import java.util.Scanner;

/**
 * @author wyf
 * @create 2020/7/29
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        Main2 t = new Main2();
        System.out.println(t.minHeap(nums, n, m));
    }

    private int minHeap(int[] nums, int n, int m) {
   /*     boolean[][] temp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && canUnion(nums, i, j)) {
                    temp[i][j] =true;
                }
            }
        }

        return 0;*/
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            Node node = new Node(nums[i]);
        }
        return 0;
    }
    private  boolean canUnion(int[] nums, int i, int j) {
        if ((nums[i] & nums[j]) == nums[i] || (nums[i] & nums[j]) == nums[j])
            return true;
        return false;
    }
    class Node{
        public int value ;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
}
