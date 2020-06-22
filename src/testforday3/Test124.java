package testforday3;

/**
 * @author wyf
 * @create 2020/6/21
 */
public class Test124 {
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if (root == null) return 0;
        findSideMaxSum(root);
        return maxSum;
    }

    private int findSideMaxSum(TreeNode root) {
        if (root == null) return 0;
        int leftMax = 0, rightMax = 0;
        if (root.left != null) {
            leftMax = findSideMaxSum(root.left) + root.left.val;
        }
        if (root.right != null) {
            rightMax = findSideMaxSum(root.right) + root.right.val;
        }
        int subMax = 0;
        if (rightMax < 0 && leftMax < 0) {
            subMax = root.val;
        } else if (rightMax < 0) {
            subMax = leftMax + root.val;
        } else if (leftMax < 0) {
            subMax = rightMax + root.val;
        } else {
            subMax = leftMax + rightMax + root.val;
        }

        if (maxSum < subMax) {
            maxSum = subMax;
        }
        return leftMax < rightMax ? (rightMax < 0 ? 0 : rightMax) : (leftMax < 0 ? 0 : leftMax);
    }

}
