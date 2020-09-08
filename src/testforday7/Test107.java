package testforday7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author wyf
 * @create 2020/9/6
 */
public class Test107 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            Queue<TreeNode> treeNodes = new LinkedList<>();
            List<List<Integer>> levelNum = new ArrayList<>();
            treeNodes.add(root);
            if (root == null) return levelNum;
            while (treeNodes.size() > 0) {
                int size = treeNodes.size();
                List<Integer> levelNode = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode node = treeNodes.poll();
                    levelNode.add(node.val);
                    if (node.left != null) {
                        treeNodes.add(node.left);
                    }
                    if (node.right != null) {
                        treeNodes.add(node.right);
                    }
                }
                levelNum.add(0,levelNode);

            }
            return levelNum;
        }
    }
}
