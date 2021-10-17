package main.java.com.yuefeng.striingPractice;

//给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
//
// 示例 1：
//
// 输入: s1 = "abc", s2 = "bca"
//输出: true
//
//
// 示例 2：
//
// 输入: s1 = "abc", s2 = "bad"
//输出: false
//
//
// 说明：
//
//
// 0 <= len(s1) <= 100
// 0 <= len(s2) <= 100
//
// Related Topics 哈希表 字符串 排序
// 👍 39 👎 0

public class CheckPermutation {

    public boolean checkPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        // 关键点！用于记录已经被使用过的元素
        boolean[] used = new boolean[s1.length()];

        for (int j = 0; j < s1.length(); j++) {
            for (int k = 0; k < s2.length(); k++) {
                if (s1.charAt(j) == s2.charAt(k) && used[k] == false) {
                    used[k] = true;
                    break;
                }

                if (k == s2.length() - 1) return false;
            }
        }

        return true;
    }
}
