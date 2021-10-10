package main.java.com.yuefeng.paracticeOfOffer;

import main.java.com.yuefeng.model.ListNode;

public class Day02ListNodeReverse {

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode node = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return node;
    }
}
