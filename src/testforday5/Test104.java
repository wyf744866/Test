package testforday5;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wyf
 * @create 2020/7/28
 */
public class Test104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int height = 0;
        Queue<TreeNode> treeQ = new LinkedList<>();
        Queue<Integer> layer = new LinkedList<>();
        treeQ.offer(root);
        layer.offer(1);
        while (treeQ.size() > 0){
            TreeNode temp = treeQ.poll();
            int a = layer.poll();
            height = Math.max(height,a);
            if (temp.left !=null){
                treeQ.offer(temp.left);
                layer.add(a+1);
            }
            if (temp.right !=null){
                treeQ.offer(temp.right);
                layer.add(a+1);
            }
        }


        return height;
    }
}
