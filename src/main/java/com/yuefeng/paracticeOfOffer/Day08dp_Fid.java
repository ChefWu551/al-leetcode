package main.java.com.yuefeng.paracticeOfOffer;

import java.util.HashMap;

// https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/
public class Day08dp_Fid {

    HashMap<Integer, Integer> hasSolvedList = new HashMap<>();
    // 递归方式求解，超时！
    public int fib(int n) {
        if (n == 1) return 1;
        if (n == 2) return 1;
        if (hasSolvedList.containsKey(n)) { return hasSolvedList.get(n); }

        int ret = fib(n-1) + fib(n-2);
        hasSolvedList.put(n, ret);
        return ret;
    }

    // 采用循环的方式
    public int fib01(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i=1; i<n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }

        return sum;

    }

}
