package testforday6;

import java.util.*;

/**
 * @author wyf
 * @create 2020/8/5
 */
public class Test337 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        // 该方法不对 可能隔很多层
/*        public int rob(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int money1 = 0;
            int money2 = 0;
            Queue<TreeNode> houses = new LinkedList<>();
            Queue<Integer> levels = new LinkedList<>();
            houses.offer(root);
            levels.offer(1);
            while (!houses.isEmpty()) {
                TreeNode house = houses.poll();
                int level = levels.poll();
                if (level % 2 == 0) {
                    money2 += house.val;
                }else {
                    money1 += house.val;
                }
                if (house.left != null){
                    houses.offer(house.left);
                    levels.offer(level+1);
                }
                if (house.right != null){
                    houses.offer(house.right);
                    levels.offer(level+1);
                }

            }
            return Math.max(money1,money2);
        }*/
        // 也不对  左右子树不相关
        public int rob(TreeNode root) {
            if (root == null) {
                return 0;
            }
            Queue<TreeNode> houses = new LinkedList<>();
            Queue<Integer> levels = new LinkedList<>();
            Map<Integer,Integer> levelMoney = new HashMap<>();
            houses.offer(root);
            levels.offer(0);
            while (!houses.isEmpty()) {
                TreeNode house = houses.poll();
                int level = levels.poll();
                if (levelMoney.containsKey(level)){
                    levelMoney.put(level,levelMoney.get(level) + house.val);
                }else {
                    levelMoney.put(level,house.val);
                }
                if (house.left != null){
                    houses.offer(house.left);
                    levels.offer(level+1);
                }
                if (house.right != null){
                    houses.offer(house.right);
                    levels.offer(level+1);
                }
            }

            int n = levelMoney.size();
            int[] moneyN = new int[n];
            moneyN[0] = levelMoney.get(0);
            for (int i = 1; i < n; i++) {
                moneyN[i] = i >= 2 ?  moneyN[i-2]+levelMoney.get(i) : levelMoney.get(i);
                moneyN[i] = Math.max(moneyN[i-1],moneyN[i]);
            }
            return moneyN[n-1];
        }

    }
}
