package main.java.com.yuefeng.alibaba;

import main.java.com.yuefeng.model.ListNode;

public class _02AddTwoNumbers {

    public static void main(String[] args) {
        _02AddTwoNumbers a = new _02AddTwoNumbers();
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(8);
        l1.next = l11;
        ListNode l2 = new ListNode(0);
        a.addTwoNumbers(l1, l2);

    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean addOne = false;
        int tmpValue = 0;
        ListNode res = new ListNode(-1);
        ListNode mv = res;
        while (l1 != null && l2 != null) {
            if (addOne) tmpValue = l1.val + l2.val + 1;
            else tmpValue = l1.val + l2.val;
            if (tmpValue >= 10) {
                tmpValue = tmpValue % 10;
                addOne = true;
            } else {
                addOne = false;
            }

            mv.next = new ListNode(tmpValue);
            l1 = l1.next;
            l2 = l2.next;
            mv = mv.next;
        }

        while (l1 != null) {
            if(addOne) tmpValue = l1.val + 1;
            else tmpValue = l1.val;
            if (tmpValue >= 10) {
                tmpValue = tmpValue % 10;
                addOne = true;
            } else {
                addOne = false;
            }
            mv.next = new ListNode(tmpValue) ;
            l1 = l1.next;
            mv = mv.next;
        }

        while (l2 != null) {
            if(addOne) tmpValue = l2.val + 1;
            else tmpValue = l2.val;
            if (tmpValue >= 10) {
                tmpValue = tmpValue % 10;
                addOne = true;
            } else {
                addOne = false;
            }
            mv.next = new ListNode(tmpValue);
            l2 = l2.next;
            mv = mv.next;
        }

        if (addOne) mv.next = new ListNode(1);


        return res.next;
    }
}
