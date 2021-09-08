package main.java.com.yuefeng.linkListPractice;

import main.java.com.yuefeng.stack.ListNode;

public class HasCycle {

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head;
        while(fast != null) {
            slow = slow.next;
            if(fast.next == null) return false;
            fast = fast.next.next;
            if(slow == fast) return true;
        }

        return false;
    }

}
