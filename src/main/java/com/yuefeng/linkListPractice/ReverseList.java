package main.java.com.yuefeng.linkListPractice;

import main.java.com.yuefeng.model.ListNode;

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
//        method2(node1);
        System.out.println("");
    }

    // 递归处理
    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode last = reverseList(head.next); // 这里的last是为了记录翻转链表后的第一个节点，哨兵模式用于记录起始节点，返回结果
        head.next.next = head;
        head.next = null;
        return last;
    }

    // 粗暴解决
    public static ListNode method2(ListNode head) {
        if (head == null || head.next == null) return head;

        int length = 0;
        ListNode moveNode = head;
        while (moveNode != null) {
            length++;
            moveNode = moveNode.next;
        }

        int[] values = new int[length];
        ListNode nodesValue = head;
        while (nodesValue != null) {
            values[--length] = nodesValue.val;
            nodesValue = nodesValue.next;
        }

        ListNode headBefore = new ListNode(-1); // 关键点1：哨兵位，用于寻找记录最开始的节点
        ListNode x = headBefore;    // 关键点2：用于对最先声明的链表进行修改，添加对应的元素
        for (int i =0; i<values.length; i++) {
            x.next = new ListNode(values[i]);
            x = x.next;
        }

        return headBefore.next;
    }


}
