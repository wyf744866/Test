package test.guanglianda;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author wyf
 * @create 2020/7/29
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> nums = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            nums.add(in.nextInt());
        }
//        System.out.println(changeList(nums));
        for (int num : changeList(nums)) {
            System.out.print(num);
            System.out.print(" ");
        }
    }

    private static List<Integer> changeList(List<Integer> nums) {
        int minRept = -1, index = 0,j = 1;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) == nums.get(i - 1)) {
                minRept = minRept == -1 ? nums.get(i) : Math.min(minRept, nums.get(i));
            }
        }
        if (minRept == -1) return nums;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == minRept){
                index = i;
                break;
            }
        }
        nums.remove(index);
        nums.set(index,nums.get(index)*2);
        changeList(nums);
        return nums;
    }
}
