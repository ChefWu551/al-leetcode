package main.java.com.yuefeng.striingPractice;

//实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
//
// 示例 1：
//
// 输入: s = "leetcode"
//输出: false
//
//
// 示例 2：
//
// 输入: s = "abc"
//输出: true
//
//
// 限制：
//
// 0 <= len(s) <= 100
// 如果你不使用额外的数据结构，会很加分。
//
// Related Topics 位运算 哈希表 字符串 排序
// 👍 135 👎 0

public class StringCharacterIsUnique {

    public static void main(String[] args) {
        String s = "abca";

        System.out.println(isUnique(s));
    }

    public static boolean isUnique(String astr) {
        if (astr.length() <= 1) return true;
        for (int n = 0; n < astr.length(); n++) {
            for (int index = n; index < astr.length() - 1; index++) {
                if (astr.charAt(n) == astr.charAt(index + 1)) {
                    return false;
                }
            }
        }

        return true;
    }
}
