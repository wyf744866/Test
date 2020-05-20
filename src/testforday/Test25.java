package testforday;

/**
 * @author wyf
 * @date 2020/5/16 - 13:01
 */
public class Test25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode subHead = head;
        ListNode newHead = null;
        int num = 1;
        while (head!= null){//以下逻辑出错
            ListNode next = head.next;
            if (next != null) {
                num++;
                if (num == k){
                    ListNode copy = next.next;
                    next.next = null;
                    if (newHead == null) {
                        newHead = reverseNode(subHead);
                    }else {
                        reverseNode(subHead);
                    }
                    subHead.next = copy;
                    next = subHead;
                    subHead = copy;
                    num = 0;

                }
            }
            head = next;
        }
       return newHead;
    }

    private ListNode reverseNode(ListNode head) {
        ListNode reversedHead = head;
        ListNode node = head;
        ListNode prev = null;
        while (node != null){
            ListNode next = node.next;
            if (next != null) {
                reversedHead = node;
            }
            node.next = prev;
            prev = node;
            node = next;
        }
        return  reversedHead;
    }
}
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }