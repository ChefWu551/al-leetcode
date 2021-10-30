package main.java.com.yuefeng.paracticeOfOffer;

import main.java.com.yuefeng.model.TreeNode;

//https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/
public class Day18FL_Btree_MaxDep {

    int maxD = 0;

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        recursion(root, 0);
        return maxD;

    }

    public void recursion(TreeNode node, int dep) {
        if (node == null) return;
        dep++;
        maxD = Math.max(maxD, dep);
        recursion(node.left, dep);
        recursion(node.right, dep);
    }
}
