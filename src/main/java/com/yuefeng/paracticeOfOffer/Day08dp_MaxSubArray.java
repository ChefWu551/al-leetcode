package main.java.com.yuefeng.paracticeOfOffer;

// https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
public class Day08dp_MaxSubArray {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return -1;

        int tmp = 0;
        int max = nums[0];
        for(int num : nums) {
            if (tmp + num >= num ) {
                tmp = num + tmp;
            } else {
                tmp = num ;
            }

            max = Math.max(max, tmp);
        }

        return max;
    }
}
