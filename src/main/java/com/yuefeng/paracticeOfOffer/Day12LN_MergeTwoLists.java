package main.java.com.yuefeng.paracticeOfOffer;

import main.java.com.yuefeng.model.ListNode;

// https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/
public class Day12LN_MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode r = new ListNode(-1);
        ListNode m = r;
        while(l1 != null && l2 != null) {
            int v1 = l1.val;
            int v2 = l2.val;
            if(v1 <= v2) {
                r.next = new ListNode(v1);
                l1 = l1.next;
            } else {
                r.next = new ListNode(v2);
                l2 = l2.next;
            }

            r = r.next;
        }

        if (l1 == null) r.next = l2;
        if (l2 == null) r.next = l1;

        return m.next;
    }
}
