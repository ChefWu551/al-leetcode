package main.java.com.yuefeng.paracticeOfOffer;

import main.java.com.yuefeng.model.TreeNode;

//todo: 未解决 https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof/
public class Day18FL_Btree_IsBalanced {

    public static void main(String[] args) {
                TreeNode root = new TreeNode(3,
                new TreeNode(20, new TreeNode(15), new TreeNode(3)),
                new TreeNode(5)
        );

        Day18FL_Btree_IsBalanced d = new Day18FL_Btree_IsBalanced();
        d.isBalanced(root);
    }
    int maxDep = 0;
    int minDep = Integer.MAX_VALUE;

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        recursion(root, 0);
        return maxDep - minDep <= 1;
    }

    public void recursion(TreeNode node, int dep) {
        if (node == null) return;
        dep++;
        maxDep = Math.max(maxDep, dep);
        if (node.left == null && node.right == null) minDep = Math.min(minDep, dep);
        recursion(node.left, dep);
        recursion(node.right, dep);
    }
}
