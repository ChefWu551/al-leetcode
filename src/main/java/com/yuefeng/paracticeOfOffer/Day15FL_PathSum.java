package main.java.com.yuefeng.paracticeOfOffer;

import main.java.com.yuefeng.model.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// https://leetcode-cn.com/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/
// 注意事项：
//      在调用方法函数前成员变量记得先引用
//      能加入到数组的之后当前值小于等于目标值才可以被加入
//      注意审题，负数也是可以的！！！
// 疑惑点：
//      如何让遍历的符合条件的结果只保存到list数组里面；（先添加近来，在判断，如果不符合在返回递归栈的之前给删除掉）
//      如何让保存结果值后的list数组清空继续下一个值得计算；（只需要保留最新的值，并且用new ArrayList来存储，原始的list依然照样更新，但是记得处理不符合返回前时候删除该元素）
public class Day15FL_PathSum {

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(5,
//                new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
//                new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1)))
//        );

        TreeNode root = new TreeNode(-2,
                null,
                new TreeNode(-3)
        );

        Day15FL_PathSum p = new Day15FL_PathSum();
        List<List<Integer>> result = p.pathSum(root, -5);
        System.out.println(result.toString());
    }

    List<List<Integer>> lists;

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        lists = new ArrayList<>();
        getList(root, target, 0, new LinkedList<Integer>());
        return lists;
    }

    public void getList(TreeNode node, int target, int cValue, LinkedList<Integer> list) {
        if (node == null ) return;

        cValue = cValue + node.val;
        list.add(node.val);

        // 说明这条链路上面的值是可用的
        if (cValue == target && node.left == null && node.right == null) {
            lists.add(new LinkedList<>(list));
        }

        getList(node.left, target, cValue, list);
        getList(node.right, target, cValue, list);
        list.removeLast();

    }

}
