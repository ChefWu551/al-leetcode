package main.java.com.yuefeng;

import main.java.com.yuefeng.stack.ListNode;

public class ReverseList {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        reverseList(node1);
    }

    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;

    }
}
