package main.java.com.yuefeng.paracticeOfOffer;

// https://leetcode-cn.com/problems/gou-jian-cheng-ji-shu-zu-lcof/
public class Day23Math_ConstructArr {
    public int[] constructArr(int[] a) {
        if(a.length <= 1) return a;
        int multiValue = 1;
        int[] b = new int[a.length];
        b[0] = 1;
        for(int i=1; i<a.length; i++) {
            b[i] = b[i-1] * a[i-1];
        }

        int tmp = 1;
        for(int i = a.length - 2; i >= 0; i--) {
            tmp = tmp * a[i+1];
            b[i] = b[i] * tmp;
        }

        return b;
    }
}
