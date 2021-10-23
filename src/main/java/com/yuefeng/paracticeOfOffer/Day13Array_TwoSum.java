package main.java.com.yuefeng.paracticeOfOffer;

import java.util.Arrays;

// https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/
public class Day13Array_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int[] result = new int[2];
        while(l < r) {
            while (l<r && nums[r] > target) r--;
            while (l<r) {
                if (nums[l] + nums[r] < target) l++;
                else if (nums[l] + nums[r] > target) r--;
                else {
                    result[0] = nums[l];
                    result[1] = nums[r];
                    return result;
                }
            }
        }

        return result;
    }
}
