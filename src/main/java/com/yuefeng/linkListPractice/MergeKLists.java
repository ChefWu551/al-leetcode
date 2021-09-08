package main.java.com.yuefeng.linkListPractice;

import main.java.com.yuefeng.stack.ListNode;

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
        if(lists.length == 0) return new ListNode();
        if (lists.length == 1) return lists[0];

        int length = lists.length;


        return null;

    }
}
