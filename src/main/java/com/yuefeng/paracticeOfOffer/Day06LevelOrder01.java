package main.java.com.yuefeng.paracticeOfOffer;

import main.java.com.yuefeng.model.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/
// 逐层打印二叉树；结果存储在一个二维数组中，
// 解决思路，逐层打印是BFS，使用队列解决，先入先出
public class Day06LevelOrder01 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9, null, null), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        Day06LevelOrder01 d = new Day06LevelOrder01();
        d.levelOrder(root);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<>();
        if(root == null) return ll;

        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while(!q.isEmpty()) {
            List<Integer> l = new ArrayList<>();
            int size = q.size();
            do {
                TreeNode t = q.poll();
                l.add(t.val);
                size--;

                if(t.left != null) q.add(t.left);
                if(t.right != null) q.add(t.right);
            } while(size > 0);

            ll.add(l);
        }

        return ll;
    }
}
