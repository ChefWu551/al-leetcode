package main.java.com.yuefeng.paracticeOfOffer;

import main.java.com.yuefeng.model.TreeNode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

//https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/
public class Day16Merge_BTree_BuildTree {

    public static void main(String[] args) {

    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;


        int headValue = preorder[0];
        int inIndex = 0;

        for (int i=0; i<inorder.length; i++) {
            if (inorder[i] == headValue) {
                inIndex = i;
                break;
            }
        }

        TreeNode head = new TreeNode(preorder[0]);
        head.left = buildTree(Arrays.copyOfRange(preorder, 1, inIndex+1),
                            Arrays.copyOfRange(inorder, 0, inIndex));
        head.right = buildTree(Arrays.copyOfRange(preorder, inIndex+1, preorder.length),
                Arrays.copyOfRange(inorder, inIndex+1, preorder.length));

        return head;
    }

}
