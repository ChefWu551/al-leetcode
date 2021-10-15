package main.java.com.yuefeng.bTreePractice;

import main.java.com.yuefeng.model.Node;
import main.java.com.yuefeng.model.TreeNode;

public class BTreePrint {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(50, new TreeNode(30, null, new TreeNode(40)), new TreeNode(70, new TreeNode(60), new TreeNode(80)));
        BTreePrint b = new BTreePrint();
        b.preOrder(root);
    }

    public void preOrder(TreeNode tree) {
        if (tree == null) return;
        System.out.println(tree.val);
        preOrder(tree.left);
        preOrder(tree.right);
    }

    public void inOrder(TreeNode tree) {
        if (tree == null) return;
        inOrder(tree.left);
        System.out.println(tree.val);
        inOrder(tree.right);
    }

    public void postOrder(TreeNode tree) {
        if (tree == null) return;
        postOrder(tree.left);
        postOrder(tree.right);
        System.out.println(tree.val);
    }
}
