package main.java.com.yuefeng;

//给你一个字符串 s，找到 s 中最长的回文子串。
//
//
//
// 示例 1：
//
//
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
//
//
// 示例 2：
//
//
//输入：s = "cbbd"
//输出："bb"
//
//
// 示例 3：
//
//
//输入：s = "a"
//输出："a"
//
//
// 示例 4：
//
//
//输入：s = "ac"
//输出："a"
//
//
//
//
// 提示：
//
//
// 1 <= s.length <= 1000
// s 仅由数字和英文字母（大写和/或小写）组成
//
// Related Topics 字符串 动态规划
// 👍 3966 👎 0


public class LongestPalindromeString {

    public static void main(String[] args) {
        String s1 = "abccbaz";
//        System.out.println(s1.substring(1, 5));
        System.out.println(longestPalindrome(s1));
    }


    /**
     * 关键点
     *  1. s.substring(beginIndex, endIndex)
     *  2. 前指针是往后移动的，后指针是往前移动的
     *  3. 尝试使用while判断，若不满足直接跳出
     *  4. 在恰当的位置判断，以最快返回第一个满足条件的字符串
     *
     * 优化点：
     *  1. 反复substring导致性能变得很低--可以先判断，保存每次符合条件的字符串
     *  2. 使用动态规划实现，矩阵类型的boolean数组，符合条件的时候才截取保存对应的字符串避免反复截取
     *
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {

        for (int subLen = s.length(); subLen > 0; subLen--) {
            for (int index = 0; index + subLen <= s.length(); index++) {
                String newStr = s.substring(index, index + subLen);
                if (newStr.length() <= 1) return newStr;
                int beginIndex = 0;
                int endIndex = newStr.length() - 1;
                while (newStr.charAt(beginIndex) == newStr.charAt(endIndex)) {
                    if (beginIndex >= endIndex) return newStr;
                        beginIndex++;
                        endIndex--;
                }
            }
        }

        return s;
    }
}
