package testforday;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author wyf
 * @date 2020/5/7 - 12:24
 */
public class Test572 {
    //错误  写的真垃圾
    public boolean isSubtree(TreeNode s, TreeNode t) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        Queue<TreeNode> queue1 = new ArrayDeque<>();
        queue.add(s);
        while (queue != null){
            TreeNode next= queue.poll();
            if (next.val == t.val) {
                queue1.add(next);
            }
            if (next.left != null){
                queue.add(next.left);
            }
            if (next.right != null) {
                queue.add(next.right);
            }
        }
        for (TreeNode treeNode : queue1) {
            if (iseuqal(treeNode,t))
                return true;
        }
        return false;
    }


    private boolean iseuqal(TreeNode treeNode, TreeNode t) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        Queue<TreeNode> queue1 = new ArrayDeque<>();
        queue.add(treeNode);
        queue1.add(t);
        while (queue != null){
            TreeNode next = queue.poll();
            TreeNode next1 = queue1.poll();
            if (next1 == null) return false;
            if (next.val != next1.val) return false;
            if (next.left != null && next1.left !=null){
                queue.add(next.left);
                queue1.add(next1.left);
            }else {
                return false;
            }
            if (next.right != null && next1.right !=null){
                queue.add(next.right);
                queue1.add(next1.right);
            }else {
                return false;
            }
        }
        return false;
    }
}

