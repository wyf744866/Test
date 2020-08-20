package testforday6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wyf
 * @create 2020/8/18
 */
public class Test109 {
    //以下方法不对 高度差大于1
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        List<Integer> valList = new ArrayList<>();
        ListNode next = head;
        while (next != null){
            valList.add(next.val);
            next = next.next;
        }
        int len = valList.size();
        TreeNode root = new TreeNode(valList.get(len/2));
        TreeNode left = root;
        TreeNode right = root;
        for (int i = 1; i <= len/2; i++) {
            if (len/2 - i >= 0){
                left.left = new TreeNode(valList.get(len/2-i));
                left = left.left;
            }
            if (len/2 + i < len){
                right.right = new TreeNode(valList.get(len/2+i));
                right = right.right;
            }
        }

        return root;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


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