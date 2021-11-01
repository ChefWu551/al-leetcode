package main.java.com.yuefeng.paracticeOfOffer;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;

// https://leetcode-cn.com/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/
public class Day10dp_LengthOfLongestSubstring {

    public static void main(String[] args) {
        Day10dp_LengthOfLongestSubstring d = new Day10dp_LengthOfLongestSubstring();
        d.lengthOfLongestSubstring("abcabcbb");
    }

    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> maps = new HashMap<>();
        int maxLen = 0;
        int tmpIndex = -1;
        for (int i=0; i<s.length(); i++) {
            char sc = s.charAt(i);
            if (maps.containsKey(sc)) tmpIndex = Math.max(maps.get(sc), tmpIndex)  ;
            maxLen = Math.max(maxLen, i - tmpIndex );
            maps.put(sc, i);

        }

        return maxLen;
    }
}
