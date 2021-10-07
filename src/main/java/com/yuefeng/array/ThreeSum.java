package main.java.com.yuefeng.array;

import sun.awt.util.IdentityArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        int[] values = new int[]{-1,0,1,2,-1,-4};
        ThreeSum t = new ThreeSum();
        List<List<Integer>> r = t.threeSum(values);
        System.out.println(r.toString());
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> r = new ArrayList<>();
        if (nums.length < 3) return r;

        boolean isContain = false;
        boolean isZero = false;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (i >= length - 2) break;

            for (int j = i+1; j < length; j++) {
                for (int k = j+1; k<length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        if (nums[i] == 0 && nums[j] == 0 && nums[k] == 0 ) isZero = true;

                        // 判断是否存在
                        for (List list : r) {
                            if (list.contains(nums[i]) && list.contains(nums[j]) && list.contains(nums[k])) {
                                isContain = true;
                                break;
                            }
                        }

                        List<Integer> values = new ArrayList<>();

                        values.add(nums[i]);
                        values.add(nums[j]);
                        values.add(nums[k]);

                        if (!isContain) {
                            r.add(values);
                        } else {
                            isContain = false;
                        }
                    }
                }
            }
        }
        
        return r;

    }
}
