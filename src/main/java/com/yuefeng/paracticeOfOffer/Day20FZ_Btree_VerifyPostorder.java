package main.java.com.yuefeng.paracticeOfOffer;

// https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/
public class Day20FZ_Btree_VerifyPostorder {
    public boolean verifyPostorder(int[] postorder) {
        return recursion(postorder, 0, postorder.length - 1);
    }

    public boolean recursion(int[] postorder, int s, int t){
        if (s >= t) return true;
        int p = s;
        while (postorder[p] < postorder[t]) p++;
        int m = p;
        while (postorder[p] > postorder[t]) p++;
        return p == t && recursion(postorder, s, m-1) && recursion(postorder, m, t-1);
    }
}
