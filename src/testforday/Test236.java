package testforday;

/**
 * @author wyf
 * @date 2020/5/10 - 13:48
 */
public class Test236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode comParent = root;
        if (isSubTree(root.left,p) && isSubTree(root.left,q) ){
            return  lowestCommonAncestor(root.left,p,q);
        }else if (isSubTree(root.right,q) && isSubTree(root.right,p)){
            return lowestCommonAncestor(root.right,p,q);
        }else {
            return comParent;
        }

    }

    private boolean isSubTree(TreeNode curr, TreeNode x) {
        if (x == null || curr == x) {
            return true;
        }
        if (curr == null) return false;
        return isSubTree(curr.left,x)||isSubTree(curr.right,x);
    }
}
