package testforday;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author wyf
 * @date 2020/5/13 - 12:26
 */
public class Test102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) return  result;
        Queue<TreeNode> tree = new LinkedList<TreeNode>();
        Queue<Integer> depths = new LinkedList<Integer>();
        tree.add(root);
        depths.add(0);
        while (!tree.isEmpty()) {
            TreeNode next = tree.poll();
            int currDeep = depths.poll();
            if (result.size() - 1 < currDeep) {
                result.add(new LinkedList<>());
            }
            result.get(currDeep).add(next.val);
            if (next.left != null) {
                tree.add(next.left);
                depths.add(currDeep + 1);
            }
            if (next.right != null) {
                tree.add(next.right);
                depths.add(currDeep + 1);
            }
        }

        return result;
    }
}
