package main.java.com.yuefeng.linkListPractice;

import main.java.com.yuefeng.model.ListNode;

//https://leetcode-cn.com/problems/add-two-numbers/
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(8);
        node1.next = node2;

        ListNode node11 = new ListNode(0);

        AddTwoNumbers numbers = new AddTwoNumbers();
        numbers.addTwoNumbers(node1, node11);
        System.out.println(Integer.MAX_VALUE);
    }

    // 方法2
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int flag = 0;
        ListNode node = new ListNode(-1);
        ListNode move = node;
        while (l1 != null && l2 != null) {
            int value = l1.val + l2.val + flag;
            move.next = new ListNode(value % 10);

            if (value >= 10) {
                flag = 1;
            } else {
                flag = 0;
            }

            l1 = l1.next;
            l2 = l2.next;
            move = move.next;
        }

        if(l1 != null || l2 != null ){
            merge(l2, move, flag);
            merge(l1, move, flag);
        } else {
            if(flag == 1) move.next = new ListNode(1);
        }

        return node.next;
    }

    public ListNode merge(ListNode node, ListNode move, int flag) {
        ListNode result = move;
        if (node == null) return null;
        if (flag == 0) {
            result.next = node;
            return move;
        }

        while (node != null) {
            int value = node.val + flag;
            result.next = new ListNode(value % 10);
            if (value == 10) {
                flag = 1;
            } else {
                flag = 0;
            }

            node = node.next;
            result = result.next;
        }

        if (flag == 1) result.next = new ListNode(1);

        return move;
    }


    public ListNode reverse(ListNode node) {
        if (node == null || node.next == null) return node;
        ListNode last = reverse(node.next);
        node.next.next = node;
        node.next = null;

        return last;
    }


    // 整形溢出问题
    public ListNode addTwoNumbersMethod1(ListNode l1, ListNode l2) {
        ListNode newL1 = reverse(l1);
        ListNode newL2 = reverse(l2);

        int result = getNodeValue(newL1) + getNodeValue(newL2);

        return initNodeByValue(result);
    }

    public int getNodeValue(ListNode node) {
        if (node.next == null) return node.val;
        int value = 0;
        while (node != null) {
            value = value * 10 + node.val;
            node = node.next;
        }

        return value;
    }

    public ListNode initNodeByValue(int result) {
        if (result == 0) return new ListNode();
        ListNode node = new ListNode(-1);
        ListNode move = node;
        while (result != 0) {
            move.next = new ListNode(result % 10);
            result = result / 10;
            move = move.next;
        }

        return node.next;
    }
}
