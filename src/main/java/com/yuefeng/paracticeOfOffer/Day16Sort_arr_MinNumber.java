package main.java.com.yuefeng.paracticeOfOffer;

import java.util.*;

public class Day16Sort_arr_MinNumber {

    public static void main(String[] args) {

        int value = ("b"+"ba").compareTo("ba"+"b");
        System.out.println(value);
    }

    public String minNumber(int[] nums) {

        String[] s = new String[nums.length];
        for(int i=0; i<nums.length; i++) {
            s[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(s, (x, y)->(x+y).compareTo(y+x));
        StringBuilder sb = new StringBuilder();

        for (String t : s) {
            sb.append(t);
        }

        return sb.toString();
    }

    public boolean compare(String s1, String s2) {


        return false;
    }
}
