package testforday;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author wyf
 * @date 2020/5/13 - 13:07
 */
public class Test102_2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        // 创建队列辅助进行层序遍历。
        Queue<TreeNode> queue = new LinkedList<>();
        // 将二叉树头节点入队。
        queue.offer(root);
        // 直到队列为空跳出循环，则遍历完成。
        while (!queue.isEmpty()) {
            // 得到每一层的元素个数。
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            // 从左到右依次添加每一层的节点数。
            while (size > 0) {
                TreeNode curr = queue.poll();
                list.add(curr.val);
                size--;
                // 依次将下一层的节点入队。
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            ans.add(list);
        }
        return ans;
    }

}
