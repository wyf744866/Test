package testforday3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author wyf
 * @create 2020/6/26
 */
public class TestM02_01 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        //不能打乱顺序
        public ListNode removeDuplicateNodes(ListNode head) {
            Set<Integer> nums = new LinkedHashSet<>();
            ListNode temp = head;
            while (temp != null){
                nums.add(temp.val);
                temp = temp.next;
            }
            ListNode newHead  = new ListNode(0);
            ListNode next= newHead;
            for (Integer num : nums) {
                ListNode newNode = new ListNode(num);
                next.next = newNode;
                next = next.next;
            }

            return newHead.next;
        }
    }
}
