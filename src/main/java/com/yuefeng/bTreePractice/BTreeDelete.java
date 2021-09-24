package main.java.com.yuefeng.bTreePractice;

import main.java.com.yuefeng.model.TreeNode;

import java.awt.event.KeyEvent;

// https://leetcode-cn.com/problems/delete-node-in-a-bst/
public class BTreeDelete {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(50, new TreeNode(30, null, new TreeNode(40)), new TreeNode(70, new TreeNode(60), new TreeNode(80)));
        BTreeDelete bTreeDelete = new BTreeDelete();
        bTreeDelete.deleteNode(root, 50);
    }

    public TreeNode deleteNode(TreeNode root, int key) {

        TreeNode m = root;
        TreeNode mp = null;
//        int deleteFlag = 0; // 0=left;1=right;
        while (m != null && m.val != key) {
            mp = m;
            if (m.val < key) {
                m = m.right;
            } else{
                m = m.left;
            }
        }

        if (m == null) return root;

        // 被删除的点有两个子节点；找到删除节点的右子树最小的节点替换
        if (m.left != null && m.right != null) {
            TreeNode rp = m.right;
            TreeNode rpp = m;

            while (rp.left != null) {
                rpp = rp;
                rp = rp.left;
            }

            m.val = rp.val;

            if (rp.right == null) { // 如果被替换的节点没有左右节点
                if (rpp == m) rpp.right = null; // ！！！特殊情况，如果替换的节点与删除的节点只隔了一层，那就直接删除替换的节点
                else rpp.left = null; // 用替换节点的父节点，设置替换节点为null
                return root;
            }

            m = rp;
            mp = rpp;
        }

        TreeNode child;
        if (m.left != null) child = m.left;
        else if (m.right != null) child = m.right;
        else child = null;

        if (mp == null) root = child;
        else if (mp.left == m) mp.left = child;
        else mp.right = child;

        return root;
    }

}
