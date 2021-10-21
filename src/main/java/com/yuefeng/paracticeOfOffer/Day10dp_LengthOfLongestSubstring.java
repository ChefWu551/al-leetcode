package main.java.com.yuefeng.paracticeOfOffer;

import javax.print.DocFlavor;

// https://leetcode-cn.com/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/
public class Day10dp_LengthOfLongestSubstring {

    public static void main(String[] args) {
        Day10dp_LengthOfLongestSubstring d = new Day10dp_LengthOfLongestSubstring();
        d.lengthOfLongestSubstring("abcabcbb");
    }
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();
        int max = 0;
        for (int i=0; i<s.length(); i++) {
            int tmp = 1;
            for (int j = i+1; j<s.length(); j++) {
                if (s.charAt(i) != s.charAt(j)) {
                    tmp++;
                } else {
                    break;
                }
            }

            max = Math.max(max, tmp);
        }

        return max;
    }
}
