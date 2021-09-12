package main.java.com.yuefeng.linkListPractice;

import main.java.com.yuefeng.model.ListNode;

//给定一个链表数组，每个链表都已经按升序排列。
//
//请将所有链表合并到一个升序链表中，返回合并后的链表。
//
// 
//
//示例 1：
//
//输入：lists = [[1,4,5],[1,3,4],[2,6]]
//输出：[1,1,2,3,4,4,5,6]
//解释：链表数组如下：
//[
//1->4->5,
//1->3->4,
//2->6
//]
//将它们合并到一个有序链表中得到。
//1->1->2->3->4->4->5->6
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/vvXgSW
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
// todo 利用哨兵模式解决
public class MergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode r = null;
        for (int i=0; i<lists.length; i++) {
            r = merge(r, lists[i]);
        }

        return r;
    }

    public ListNode merge(ListNode node1, ListNode node2) {
        ListNode startNode = new ListNode(-1); // 借助哨兵节点

        ListNode moveNode = startNode;
        while (node1 != null && node2 != null) {
            if (node1.val <= node2.val) {
                moveNode.next = node1;
                node1 = node1.next;
            } else {
                moveNode.next = node2;
                node2 = node2.next;
            }

            moveNode = moveNode.next;
        }

        if (node1 == null) moveNode.next = node2;
        if (node2 == null) moveNode.next = node1;

        return startNode.next;
    }
}
