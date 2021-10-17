package main.java.com.yuefeng.paracticeOfOffer;

import java.util.HashMap;

public class Day08Fid {
    HashMap<Integer, Integer> hasSolvedList = new HashMap<>();

    public int fib(int n) {
        if (n == 1) return 1;
        if (n == 2) return 1;
        if (hasSolvedList.containsKey(n)) { return hasSolvedList.get(n); }

        int ret = fib(n-1) + fib(n-2);
        hasSolvedList.put(n, ret);
        return ret;
    }

}
