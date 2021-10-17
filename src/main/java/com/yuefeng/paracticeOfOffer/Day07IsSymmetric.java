package main.java.com.yuefeng.paracticeOfOffer;

import com.sun.jmx.remote.internal.ArrayQueue;
import main.java.com.yuefeng.model.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

//https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/
public class Day07IsSymmetric {

    // 解题关键1： 找到递归公式 node.left == node.right
    // 解题关键2： 判断是否符合条件的情况 两个节点同时不为空，且值相等，否则其他情况均为不满足条件
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return check(root.left, root.right);
    }

    public boolean check(TreeNode a, TreeNode b) {
        if(a == null && b == null) return true;
        if(a == null || b == null || a.val != b.val) return false;

        return check(a.left, b.right) && check(a.right, b.left);
    }

}
