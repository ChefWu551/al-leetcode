package main.java.com.yuefeng.paracticeOfOffer;

import main.java.com.yuefeng.model.Node;
import main.java.com.yuefeng.model.TreeNode;

import java.util.*;

public class Day15FL_TreeToDoublyList {

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(4,
//                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
//                new TreeNode(5)
//        );

        TreeNode root = new TreeNode(1

        );

        Day15FL_TreeToDoublyList d = new Day15FL_TreeToDoublyList();
        d.treeToDoublyList(root);

    }

    Queue<TreeNode> q;

    public TreeNode treeToDoublyList(TreeNode root) {
        if (root == null) return root;
        q = new ArrayDeque<>();
        TreeNode head;
        TreeNode pre;
        TreeNode cur;

        recursion(root);
        head = q.poll();
        pre = head;
        cur = head;
        while (!q.isEmpty()) {
            cur = q.poll();
            pre.right = cur;
            cur.left = pre;
            pre = cur;
        }


        head.left = cur;
        cur.right = head;



        return head;
    }

    public void recursion(TreeNode node) {
        if(node == null) return;
        recursion(node.left);
        q.add(node);
        recursion(node.right);
    }

}
