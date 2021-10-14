package main.java.com.yuefeng.paracticeOfOffer;

public class Day04Search {
    public int search(int[] nums, int target) {
        int time = 0;
        for(int num: nums) {
            if (num == target) time++;
        }

        return time;
    }
}
