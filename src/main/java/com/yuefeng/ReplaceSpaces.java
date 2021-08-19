package main.java.com.yuefeng;
//URL化。编写一种方法，将字符串中的空格全部替换为%20。假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。（注：用Java实现的话，
//请使用字符数组实现，以便直接在数组上操作。）
//
//
//
// 示例 1：
//
//
//输入："Mr John Smith    ", 13
//输出："Mr%20John%20Smith"
//
//
// 示例 2：
//
//
//输入："               ", 5
//输出："%20%20%20%20%20"
//
//
//
//
// 提示：
//
//
// 字符串长度在 [0, 500000] 范围内。
//
// Related Topics 字符串
// 👍 47 👎 0



import java.util.Arrays;

public class ReplaceSpaces {

    public static void main(String[] args) {
        String s = "Mr John Smith    ";
        System.out.println(replaceSpaces(s, 13));
    }

    public static String replaceSpaces(String S, int length) {
        if (S == null) return null;
        String[] newStr = new String[length];
        for (int index=0; index<S.length(); index++){
            if (index < length) {
                if (S.charAt(index) == ' ') {
                    newStr[index] = "%20";
                } else {
                    newStr[index] = String.valueOf(S.charAt(index));
                }
            }
        }

        StringBuffer bufferStr = new StringBuffer();
        for (String value : newStr) {
            bufferStr.append(value);
        }

        return bufferStr.toString();
    }

    public static String replaceSpaces1(String S, int length) {
        if (S == null) return null;
        return S.substring(0, length).replace(" ", "%20");
    }
}
