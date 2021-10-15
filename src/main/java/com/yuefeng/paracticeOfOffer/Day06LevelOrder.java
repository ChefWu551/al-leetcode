package main.java.com.yuefeng.paracticeOfOffer;

import main.java.com.yuefeng.bTreePractice.BTreePrint;
import main.java.com.yuefeng.model.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/
// 逐层打印二叉树
// 解决思路，逐层打印是BFS，使用队列解决，先入先出
public class Day06LevelOrder {
    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        List<Integer> l = new ArrayList<>();

        while (!queue.isEmpty()) {
            TreeNode tn = queue.poll();
            l.add(tn.val);

            if (tn.left != null) queue.add(tn.left);
            if (tn.right != null) queue.add(tn.right);
        }

        int[] values = new int[l.size()];
        for (int i=0;i<l.size(); i++) {
            values[i] = l.get(i);
        }

        return values;
    }
}
