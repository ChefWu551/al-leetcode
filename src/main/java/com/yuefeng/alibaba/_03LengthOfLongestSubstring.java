package main.java.com.yuefeng.alibaba;

import java.util.HashMap;
import java.util.Map;

public class _03LengthOfLongestSubstring {
    public static void main(String[] args) {
        _03LengthOfLongestSubstring l = new _03LengthOfLongestSubstring();
        l.lengthOfLongestSubstring("abba");
    }

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> m = new HashMap<>();
        int maxLen = 0;
        int tmpIndex = -1;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (m.containsKey(c))
                tmpIndex = Math.max(m.get(c), tmpIndex);
            maxLen = Math.max(maxLen, i - tmpIndex);
            m.put(c, i);
        }

        return maxLen;
    }
}
