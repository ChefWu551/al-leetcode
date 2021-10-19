package main.java.com.yuefeng.paracticeOfOffer;

// https://leetcode-cn.com/problems/gu-piao-de-zui-da-li-run-lcof/
public class Day09dp_MaxProfit {
    public int maxProfit(int[] prices) {

        int max = 0;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int value = prices[i] - prices[i-1] + profit;
            if (value > 0) {
                profit = prices[i] - prices[i-1] + profit ;
            } else {
                profit = 0;
            }

            max = Math.max(max, profit);
        }

        return max;
    }
}
