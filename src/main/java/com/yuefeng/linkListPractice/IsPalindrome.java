package main.java.com.yuefeng.linkListPractice;
//编写一个函数，检查输入的链表是否是回文的。
//
//
//
// 示例 1：
//
// 输入： 1->2
//输出： false
//
//
// 示例 2：
//
// 输入： 1->2->2->1
//输出： true
//
//
//
//
// 进阶：
//你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
// Related Topics 栈 递归 链表 双指针
// 👍 76 👎 0

import main.java.com.yuefeng.model.ListNode;

public class IsPalindrome {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(-129);
        node1.next = new ListNode(-129);

        System.out.println(isPalindrome(node1));

    }

    public static boolean isPalindrome(ListNode head) {

        if (head == null) return true;
        ListNode tempNode = new ListNode();
        tempNode = head;

        int length = 1;
        while (tempNode.next != null) {
            length++;
            tempNode = tempNode.next;
        }

        int[] values = new int[length];

        int moveNum = 0;
        while (head != null) {
            values[moveNum] = head.val;
            head = head.next;
            moveNum++;
        }

        int lastIndex = length - 1;
        int headIndex = 0;
        while (headIndex <= lastIndex) {
            if (values[lastIndex] != values[headIndex]) return false;
            headIndex++;
            lastIndex--;
        }

        return true;
    }
}
