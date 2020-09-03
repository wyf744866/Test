package test.tengxun;

import java.util.Scanner;

/**
 * @author wyf
 * @create 2020/8/23
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Node head = new Node(0);
        Node next = head;
        for (int i = 0; i < n; i++) {
            next.next = new Node(sc.nextInt());
            next = next.next;
        }
        head = head.next;
        delNode(head,k);
        while (head != null){
            System.out.print(head.val);
            System.out.print(" ");
            head = head.next;
        }
    }

    private static void delNode(Node head, int k) {
        Node nextPre = head;
        for (int i = 1; i < k-1; i++) {
            nextPre = nextPre.next;
        }
        Node nextDel = nextPre.next;
        nextPre.next = nextDel.next;
    }
}
class Node{
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}
