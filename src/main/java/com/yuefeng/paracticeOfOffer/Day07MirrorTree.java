package main.java.com.yuefeng.paracticeOfOffer;

import main.java.com.yuefeng.model.TreeNode;

import java.util.Stack;

//https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/
// todo: 复习解题关键
public class Day07MirrorTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        Day07MirrorTree d = new Day07MirrorTree();
        TreeNode t = d.mirrorTree(root);
        System.out.println();
    }

    // 方法2：直接将根节点的左右两边对调，递归处理对应的子节点
    public TreeNode mirrorTree2(TreeNode root) {
        if (root == null) return null;
        TreeNode r = root.left;
        root.left = mirrorTree2(root.right);
        root.right = mirrorTree2(r);

        return root;
    }

    // todo:方法3：使用栈求解，非递归
    public TreeNode mirrorTree3(TreeNode root) {
        if (root == null) return null;
        Stack<TreeNode> st = new Stack<TreeNode>(){{ add(root); }};
        if (!st.isEmpty()) {
            TreeNode node = st.pop();
            if (node.left != null) st.add(node.left);
            if (node.right != null) st.add(node.right);

            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }

        return root;
    }


    // 方法1：
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null) return null;
        TreeNode copyTree = new TreeNode(-1);
        return copyMirrorTree(root, copyTree);
    }

    public TreeNode copyMirrorTree(TreeNode tree, TreeNode cTree) {
        if(tree == null) return cTree;

        cTree = new TreeNode(tree.val);
        // 下面的 TreeNode right 临时存储对应的节点，然后并且植入 root节点，这是在递归中解题的关键
        TreeNode right = copyMirrorTree(tree.left, cTree.right);
        TreeNode left = copyMirrorTree(tree.right, cTree.left);

        cTree.right = right;
        cTree.left = left;
        return cTree;
    }
}
