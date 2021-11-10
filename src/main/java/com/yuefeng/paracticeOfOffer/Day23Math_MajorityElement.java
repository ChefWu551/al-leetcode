package main.java.com.yuefeng.paracticeOfOffer;

import java.util.HashMap;
import java.util.Map;

//https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/
public class Day23Math_MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> res = new HashMap<>();
        int length = nums.length;
        for (int i=0; i<length; i++) {
            if(res.get(nums[i]) == null) res.put(nums[i], 1);
            else res.put(nums[i], res.get(nums[i]) + 1);
        }

        for(Map.Entry<Integer, Integer> m : res.entrySet()) {
            if(m.getValue() > length / 2) return m.getKey();
        }

        return 0;
    }


    public int majorityElement01(int[] nums) {
        int majorNum = 0;
        int count = 0;
        for(int num : nums) {
            if (count == 0) majorNum = num;
            if (majorNum != num) count--;
            else count++;
        }

        return majorNum;
    }


}
