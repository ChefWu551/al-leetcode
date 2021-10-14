package main.java.com.yuefeng.paracticeOfOffer;

public class Day04MissingNumber {

    public int missingNumber(int[] nums) {
        for(int i=0; i < nums.length; i++) {
            if(nums[i] != i) {
                return i;
            }
        }

        return nums.length;
    }

}
