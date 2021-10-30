package main.java.com.yuefeng.paracticeOfOffer;


import main.java.com.yuefeng.model.TreeNode;

public class Day20FZ_Btree_LowestCommonAncestor {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6,
                new TreeNode(2,
                        new TreeNode(0),
                        new TreeNode(4, new TreeNode(3), new TreeNode(5))),
                new TreeNode(8,
                        new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)));

        Day20FZ_Btree_LowestCommonAncestor d = new Day20FZ_Btree_LowestCommonAncestor();
        d.lowestCommonAncestor(root, new TreeNode(4), new TreeNode(5));
    }

    TreeNode tmp;
    int b = 0;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return root;

        if (p.val > root.val && q.val > root.val)
           return lowestCommonAncestor(root.right, p, q);
        if (p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left, p, q);
        b++;
        return root;

    }
}
