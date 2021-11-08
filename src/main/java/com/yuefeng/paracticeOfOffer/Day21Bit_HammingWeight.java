package main.java.com.yuefeng.paracticeOfOffer;

//https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
public class Day21Bit_HammingWeight {



    public int hammingWeight(int n) {
        int count = 0;
        int bitCount = 31;
        while (bitCount >= 0) {
            if ((n >> bitCount & 1) == 1) count++;
            bitCount--;
        }

        return count;
    }


}
