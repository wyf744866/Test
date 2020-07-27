package testforday5;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wyf
 * @create 2020/7/21
 */
public class Test95 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public List<TreeNode> generateTrees(int n) {
            if (n == 0) {
                return new LinkedList<TreeNode>();
            }
            return generate_trees(1, n);
        }

        private List<TreeNode> generate_trees(int start, int end) {
            List<TreeNode> result = new ArrayList<>();
            if (start > end){
                result.add(null);
                return  result;
            }
            for (int i = start; i <= end; i++) {
                List<TreeNode> left_trees = generate_trees(start,i-1);
                List<TreeNode> right_trees = generate_trees(i+1,end);
                for (TreeNode l : left_trees) {
                    for (TreeNode r : right_trees) {
                        result.add(new TreeNode(i,l,r));
                    }
                }
            }
            return result;
        }
    }
}
