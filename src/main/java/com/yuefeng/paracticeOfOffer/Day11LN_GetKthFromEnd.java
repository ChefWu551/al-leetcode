package main.java.com.yuefeng.paracticeOfOffer;

import main.java.com.yuefeng.model.ListNode;

// https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
public class Day11LN_GetKthFromEnd {

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode m = head;
        int length = 0;
        while(m != null) {
            m = m.next;
            length++;
        }

        int index = 0;
        while(index != length-k) {
            head = head.next;
            index++;
        }

        return head;
    }
}
