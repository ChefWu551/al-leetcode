package main.java.com.yuefeng.paracticeOfOffer;

//https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/submissions/
public class Day03ReplaceSpace {
    public String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }

    public String replaceSpace2(String s) {
        StringBuilder r = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == ' ') {
                r.append("%20");
            } else {
                r.append(s.charAt(i));
            }
        }

        return r.toString();
    }
}
