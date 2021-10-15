package main.java.com.yuefeng.paracticeOfOffer;

import main.java.com.yuefeng.model.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/
// 逐层打印二叉树; 结果存储在二维数组中，第一层 正序，第二层逆序，第三层正序，第四层逆序。。。
// 解决思路，逐层打印是BFS，使用队列解决，先入先出
public class Day06LevelOrder02 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<>();
        if(root == null) return ll;

        Queue<TreeNode> q1 = new ArrayDeque<>();
        q1.add(root);
        int dep = 1;

        while(!q1.isEmpty()) {
            List<Integer> l = new ArrayList<>();
            int size = q1.size();

            do {
                TreeNode t = q1.poll();
                l.add(t.val);
                size--;

                if(t.left != null) q1.add(t.left);
                if(t.right != null) q1.add(t.right);
            } while(size>0);

            if(dep % 2 == 1) {
                ll.add(l);
            } else {
                ll.add(reverse(l));
            }

            dep++;
        }

        return ll;
    }

    public List<Integer> reverse(List<Integer> list) {
        int l = 0;
        int r = list.size() - 1;
        while (l < r) {
            int valueL = list.get(l);
            int valueR = list.get(r);
            list.set(l, valueR);
            list.set(r, valueL);
            l++;
            r--;
        }

        return list;
    }
}
