package main.java.com.yuefeng.linkListPractice;

import main.java.com.yuefeng.stack.ListNode;

public class MiddleNode {

    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode s = head;
        ListNode f = head;

        while(f != null) {
            f = f.next;
            if(f == null) break;
            f = f.next;
            s = s.next;
        }

        return s;
    }
}
