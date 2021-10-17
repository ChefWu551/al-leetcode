package main.java.com.yuefeng.paracticeOfOffer;

import main.java.com.yuefeng.model.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

//https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof/
// todo: 复习解题关键
public class Day07IsSubStructure {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(0, new TreeNode(-4), new TreeNode(-3)), new TreeNode(1, null, null));
        TreeNode bNode = new TreeNode(1, new TreeNode(-4), null);

        Day07IsSubStructure d = new Day07IsSubStructure();
        System.out.println(d.isSubStructure(root, bNode));
    }

    // 效率100%
    public boolean isSubStructure1(TreeNode A, TreeNode B) {
        if(B == null) return false; // 说明B是空
        if(A == null) return false; // 基准条件：说明A到底了

        boolean isTrue = check1(A, B);
        boolean isTrueL = isSubStructure(A.left, B);  // 递归求解左子树是否存在相等情况
        boolean isTrueR = isSubStructure(A.right, B); // 递归求解又子树是否存在相等情况

        // 只要有一个为true说明就是存在子树的情况
        return isTrue || isTrueL || isTrueR;
    }

    public boolean check1(TreeNode a, TreeNode b) {
        if (b ==  null) return true;
        if(a == null || a.val != b.val) return false;

        return check1(a.left, b.left) && check1(a.right, b.right);
    }


    // 效率5%
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(B == null) return false;

        Queue<TreeNode> aTree = new ArrayDeque<>();
        aTree.add(A);

        while(!aTree.isEmpty()) {
            TreeNode aNode = aTree.poll();
            if(aNode.val == B.val) {
                if (check(aNode, B, true)) return true;
            }

            if(aNode.left != null) aTree.add(aNode.left);
            if(aNode.right != null) aTree.add(aNode.right);
        }

        return false;
    }

    public boolean check(TreeNode a, TreeNode b, boolean isFalse) {
        if(b == null) return true;
        if(a == null || a.val != b.val) isFalse = false;

        // 重要：在递归中如何把需要的值出传出本层到达上一层
        return isFalse && check(a.left, b.left, isFalse) && check(a.right, b.right, isFalse);
    }
}
