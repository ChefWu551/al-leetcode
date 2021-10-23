package main.java.com.yuefeng.paracticeOfOffer;

import main.java.com.yuefeng.model.ListNode;

import java.util.Arrays;

// https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
public class Day13Array_Exchange {

    public static void main(String[] args) {
        int[] nums = {2,16,3,5,13,1,16,1,12,18,11,8,11,11,5,1};
        Day13Array_Exchange d = new Day13Array_Exchange();
        System.out.println(Arrays.asList(d.exchange(nums)).toString());
    }
    public int[] exchange(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while(l < r) {
            while (nums[l] % 2 == 1 && l < r) {
                l++;
            }

            while (nums[r] % 2 == 0 && l < r) {
                r--;
            }

            if (l < r) {
                int tmp = nums[l];
                nums[l] = nums[r];
                nums[r] = tmp;
            }

        }

        return nums;
    }
}
