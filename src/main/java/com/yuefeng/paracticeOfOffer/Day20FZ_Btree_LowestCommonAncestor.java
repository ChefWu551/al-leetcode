package main.java.com.yuefeng.paracticeOfOffer;


import main.java.com.yuefeng.model.TreeNode;

public class Day20FZ_Btree_LowestCommonAncestor {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6),
                        new TreeNode(2, new TreeNode(7), new TreeNode(4))),
                new TreeNode(1,
                        new TreeNode(0), new TreeNode(8)));

        Day20FZ_Btree_LowestCommonAncestor d = new Day20FZ_Btree_LowestCommonAncestor();
        d.lowestCommonAncestor(root, new TreeNode(4), new TreeNode(8));
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root.val == p.val || root.val == q.val) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null && right == null) return null; // 1.
        if(left == null) return right; // 3.
        if(right == null) return left; // 4.
        return root; // 2. if(left != null and right != null)
    }

}
