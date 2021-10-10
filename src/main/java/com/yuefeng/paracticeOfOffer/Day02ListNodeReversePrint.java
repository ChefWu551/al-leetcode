package main.java.com.yuefeng.paracticeOfOffer;

import main.java.com.yuefeng.model.ListNode;

public class Day02ListNodeReversePrint {


    static class Solution {

        // 链表反转
        public int[] reversePrint(ListNode head) {
            int[] r = null;
            if(head == null ) return new int[0];

            ListNode m = head;
            int length = 0;
            while(m != null) {
                length++;
                m = m.next;
            }

            r = new int[length];

            while(head != null) {
                r[--length] = head.val;
                head = head.next;
            }

            return r;
        }

        // 直接用栈解决

    }
}
