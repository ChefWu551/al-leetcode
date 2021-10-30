package main.java.com.yuefeng.paracticeOfOffer;

import main.java.com.yuefeng.model.TreeNode;

//todo: 未解决 https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof
// 平衡二叉树的定义： 任意节点的左右子树的（最大)深度值相差不能大于1
public class Day18FL_Btree_IsBalanced {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3, new TreeNode(4, new TreeNode(5), new TreeNode(5)),
                                new TreeNode(4)),
                        new TreeNode(3, new TreeNode(4), new TreeNode(4))),
                new TreeNode(2,
                        new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)));


        Day18FL_Btree_IsBalanced d = new Day18FL_Btree_IsBalanced();
        System.out.println(d.isBalanced01(root));

    }



    public boolean isBalanced01(TreeNode root) {
        if (root == null) return true;
        int d1 = depth(root.left);
        int d2 =  depth(root.right);
        return Math.abs(d1 - d2) <= 1 && isBalanced01(root.left) && isBalanced01(root.right);
    }

    int value = 0;

    private int depth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }




}
