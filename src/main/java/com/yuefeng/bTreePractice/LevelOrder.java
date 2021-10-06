package main.java.com.yuefeng.bTreePractice;

import main.java.com.yuefeng.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
public class LevelOrder {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(50, new TreeNode(30, null, new TreeNode(40)), new TreeNode(70, new TreeNode(60), new TreeNode(80)));
        List<Integer> values = new ArrayList<>();
        LevelOrder order = new LevelOrder();
        order.levelOrder(root);
        System.out.println(values);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        int level = 0;
        preOrder(result, root, level);
        return result;
    }

   public List<List<Integer>> preOrder(List<List<Integer>> values, TreeNode node, int level) {

        if (node == null) {
            return values;
        }

        if (values.size() == level) values.add(level, new ArrayList<>());
        values.get(level).add(node.val);
        level++;
        preOrder(values, node.left, level);
        preOrder(values, node.right, level);
        return values;
   }
}
