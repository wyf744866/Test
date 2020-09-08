package testforday7;

/**
 * @author wyf
 * @create 2020/9/4
 */
public class Test23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        return solve(lists, 0, lists.length-1);
    }

    private ListNode solve(ListNode[] arr, int left, int right){
        if(left == right) return arr[left];

        int mid = (left + right) >> 1;
        ListNode lNode = solve(arr, left, mid);
        ListNode rNode = solve(arr, mid+1, right);

        return merge(lNode, rNode);
    }

    private ListNode merge(ListNode node1, ListNode node2){
        if(node1 == null) return node2;
        if(node2 == null) return node1;

        if(node1.val < node2.val){
            node1.next = merge(node1.next, node2);
            return node1;
        }else{
            node2.next = merge(node1, node2.next);
            return node2;
        }
    }
class ListNode{
        int val;
        ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
}
