package main.java.com.yuefeng.paracticeOfOffer;

import main.java.com.yuefeng.model.ListNode;

// https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
public class Day11LN_DeleteNode {

    public ListNode deleteNode(ListNode head, int val) {
        if(head == null) return null;
        if(head.val == val) return head.next;
        ListNode node = head;
        while (node != null) {
            if (node.next.val == val) {
                node.next = node.next.next;
                break;
            } else {
                node = node.next;
            }
        }

        return head;
    }
}
