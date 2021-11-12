package main.java.com.yuefeng.alibaba;

import java.util.HashMap;
import java.util.Map;

public class _01TwoSum {

    public static void main(String[] args) {
        int[] values = {2, 7, 9, 11};
        int target = 9;
        _01TwoSum t = new _01TwoSum();
        t.twoSum01(values, target);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++) {
            for(int j = i+1; j<nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }

        return res;
    }

    public int[] twoSum01(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i=0; i< nums.length; i++) {
            if(m.get(nums[i]) != null) return new int[]{i, m.get(nums[i])};
            m.put(target - nums[i], i);
        }

        return new int[2];
    }
}
