package main.java.com.yuefeng.paracticeOfOffer;

// https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/
public class Day08dp_NumWays {
    public int numWays(int n) {
        if(n == 0) return 1;
        if(n == 1) return 1;
        int a = 1;
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
