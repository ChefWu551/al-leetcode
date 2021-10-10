package main.java.com.yuefeng.paracticeOfOffer;

import main.java.com.yuefeng.model.ListNode;

import java.util.Stack;

// https://leetcode-cn.com/problems/reverse-linked-list-ii/
public class Day02ListNodeReversePlus {

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

        Day02ListNodeReversePlus p = new Day02ListNodeReversePlus();
        p.reverseBetween(node1, 1, 3);

        System.out.println(p);
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) return head;

        int index = 1;
        ListNode change = head;
        while (index != left) {
            change = change.next;
            index++;
        }

        ListNode c = change;

        Stack<Integer> s = new Stack<>();
        while (index <= right) {
            s.push(change.val);
            change = change.next;
            index++;
        }

        while (!s.empty()) {
            c.val = s.pop();
            c = c.next;
        }

        return head;
    }
}
