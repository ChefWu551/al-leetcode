package main.java.com.yuefeng.paracticeOfOffer;

import java.util.*;

// https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
public class Day04FindRepeatNumber {

    public int findRepeatNumber(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int num : nums) {
            if (m.get(num) != null) {
                return num;
            } else {
                m.put(num, 1);
            }
        }

        return 0;
    }

    // todo: 用set处理
    public int findRepeatNumber1(int[] nums) {
        Set<Integer> s = new HashSet<>();

        for(int num : nums) {
            if(!s.add(num)) {
                return num;
            } else {
                s.add(num);
            }
        }

        return 0;
    }
}
