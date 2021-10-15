package main.java.com.yuefeng.Hottest100;

import java.util.HashSet;
import java.util.Set;

// https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        LengthOfLongestSubstring l = new LengthOfLongestSubstring();
        l.lengthOfLongestSubstring1("abcabcbb");
    }

    //    7.58%
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")) return 0;
        int max = 0;

        for(int i=0; i<s.length(); i++) {
            Set<Character> set = new HashSet<>();
            int tc = 0;
            for(int j=i; j<s.length(); j++) {
                if(set.contains(s.charAt(j))) break;
                tc++;
                set.add(s.charAt(j));
            }

            if(max<tc) max = tc;
        }

        return max;
    }

    public int lengthOfLongestSubstring1(String s) {
        if(s.equals("")) return 0;
        int max = 0;

        for(int i=0; i<s.length(); i++) {
            int tc = 1;
            for(int j=i+1; j<s.length(); j++) {

                if(s.charAt(i) == s.charAt(j)) break;
                tc++;
            }

            if(max<tc) max = tc;
        }

        return max;
    }
}
