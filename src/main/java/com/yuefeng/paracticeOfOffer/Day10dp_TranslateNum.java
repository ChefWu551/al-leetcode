package main.java.com.yuefeng.paracticeOfOffer;

// https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/
public class Day10dp_TranslateNum {
    // todo: 动态规划的方程写出来
    public int translateNum(int num) {
        if(num == 0) return 1;
        int one = 1;
        int two = 1;
        int numWay = 0;
        while(num != 0) {
            int value = num % 10;
            num = num / 10;
            int tmp = num % 10;
            numWay = (tmp * 10 + value <= 25 && tmp * 10 + value >= 10) ?  one + two : one;

            two = one;
            one = numWay;
        }

        return numWay;
    }
}
