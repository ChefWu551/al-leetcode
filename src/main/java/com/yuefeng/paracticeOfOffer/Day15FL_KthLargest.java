package main.java.com.yuefeng.paracticeOfOffer;

import main.java.com.yuefeng.model.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class Day15FL_KthLargest {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3,
                new TreeNode(1, null,  new TreeNode(2)),
                new TreeNode(4)
        );

        Day15FL_KthLargest d = new Day15FL_KthLargest();
        System.out.println(d.kthLargest(root, 1));;
    }

    int count = 0;
    int value = 0;

    public int kthLargest(TreeNode root, int k) {
        if (root == null || count == k) return value;
        kthLargest(root.right, k);
        count++;
        if (count == k) {
            value = root.val;
            return value;
        }
        if (count < k) kthLargest(root.left, k);

        return value;
    }

}
