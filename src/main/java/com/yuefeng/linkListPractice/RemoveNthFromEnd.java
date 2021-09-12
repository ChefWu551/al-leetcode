package main.java.com.yuefeng.linkListPractice;

import main.java.com.yuefeng.model.ListNode;

// 移除链表倒数第N个节点
public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ListNode lenMove = head;
        int length = 0; // 获取数组长度的方法可以封装
        while (lenMove != null) {
            length++;
            lenMove = lenMove.next;
        }

        if (length == 1 && n==1) return null;
        if (length - n - 1 == -1) return head.next;

        int step = 0;
        ListNode changeNode = head;
        while (step != length - n - 1) {
            changeNode = changeNode.next;
            step++;
        }

        changeNode.next = changeNode.next.next;
        return head;
    }

}
