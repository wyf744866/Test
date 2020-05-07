package testforday;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author wyf
 * @date 2020/5/5 - 19:34
 */
public class Test98 {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queueTree = new ArrayDeque<TreeNode>();
        queueTree.add(root);
        while (!queueTree.isEmpty()) {
            TreeNode next = queueTree.poll();
            if (next.left != null) {
                if (next.val > next.left.val) {
                    queueTree.add(next.left);
                } else {
                    return false;
                }
            }
            if (next.right != null) {
                if (next.val < next.right.val) {
                    queueTree.add(next.right);
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int x) {
        val = x;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}